package site.spadeworker.penterest.domain.member;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class MemoryMemberRepository implements MemberRepository {

    // Member 저장소
    private static Map<Long, Member> store = new HashMap<>();
    // Member idx
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        log.info("save : member={}", member);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Member findById(Long id) {
        return store.get(id);
    }

    @Override
    public Optional<Member> findByLoginId(String loginId) {
        List<Member> all = findAll();
        for (Member m : all) {
            if (m.getLoginId().equals(loginId)) {
                return Optional.of(m);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
