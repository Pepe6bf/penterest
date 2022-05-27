package site.spadeworker.penterest.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import site.spadeworker.penterest.domain.member.Member;
import site.spadeworker.penterest.web.annotation.login.Login;
import site.spadeworker.penterest.web.login.utils.SessionConst;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homeLogin(@Login Member loginMember, Model model) {

        // 세션에 회원 데이터가 없으면, home으로 이동
        if (loginMember == null) {
            return "home";
        }

        // 세션이 유지되면, 로그인 홈으로 이동
        model.addAttribute("member", loginMember);
        return "loginHome";
    }
}
