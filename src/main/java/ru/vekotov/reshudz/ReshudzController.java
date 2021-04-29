package ru.vekotov.reshudz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReshudzController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/all")
    public String all() {
        return "all";
    }

    @GetMapping("/reg")
    public String reg() {
        return "reg";
    }

    @GetMapping("/answer")
    public String answer() {
        return "answer";
    }
}
