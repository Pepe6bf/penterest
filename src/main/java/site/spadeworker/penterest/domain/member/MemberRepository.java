package site.spadeworker.penterest.domain.member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    /**
     * 회원 가입
     * @param member
     * @return
     */
    Member save(Member member);

    /**
     * 회원 단건 조회
     * @param id
     * @return
     */
    Member findById(Long id);

    /**
     * 회원 단건 조회 (Login Id)
     * @param loginId
     * @return
     */
    Optional<Member> findByLoginId(String loginId);

    /**
     * 회원 목록 조회
     * @return
     */
    List<Member> findAll();
}
