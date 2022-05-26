package site.spadeworker.penterest.service.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import site.spadeworker.penterest.domain.member.Member;
import site.spadeworker.penterest.domain.member.MemberRepository;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public Member save(Member member) {
        return memberRepository.save(member);
    }


}
