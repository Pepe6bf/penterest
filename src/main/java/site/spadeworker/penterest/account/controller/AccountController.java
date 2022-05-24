package site.spadeworker.penterest.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/")
    public String helloWorld(Model model) {
        return "account/test";
    }
}
