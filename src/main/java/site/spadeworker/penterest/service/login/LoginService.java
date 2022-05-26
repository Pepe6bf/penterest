package site.spadeworker.penterest.service.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import site.spadeworker.penterest.domain.member.Member;
import site.spadeworker.penterest.domain.member.MemberRepository;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class LoginService {

    private final MemberRepository memberRepository;

    /**
     * 로그인
     * @param loginId
     * @param password
     * @return null이면 로그인 실패
     */
    public Member login(String loginId, String password) {
        Optional<Member> findMemberOptional = memberRepository.findByLoginId(loginId);
        Member member = findMemberOptional.get();

        if (member.getPassword().equals(password)) {
            return member;
        } else {
            return null;
        }
    }
}
