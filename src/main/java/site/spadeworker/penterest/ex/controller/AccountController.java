package site.spadeworker.penterest.ex.controller;

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
