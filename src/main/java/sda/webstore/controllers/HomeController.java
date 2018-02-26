package sda.webstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    String index(Model model) {
        model.addAttribute("message", "Witaj na stronie głównej!");
        return "index";
    }
}
