package site.spadeworker.penterest.domain.member;

import java.util.List;
import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository {
    @Override
    public Member save(Member member) {
        return null;
    }

    @Override
    public Member findById(Long id) {
        return null;
    }

    @Override
    public Optional<Member> findByLoginId(String loginId) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
