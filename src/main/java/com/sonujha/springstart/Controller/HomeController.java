package com.sonujha.springstart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @GetMapping("/index")
    public String index(Model model) {
        return "index";
    }
    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }
    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }

    @GetMapping("/course")
    public String course(Model model) {
        return "course";
    }

    @GetMapping("/detail")
    public String detail(Model model) {
        return "detail";
    }

    @GetMapping("/feature")
    public String feature(Model model) {
        return "feature";
    }
    @GetMapping("/team")
    public String team(Model model) {
        return "team";
    }
    @GetMapping("/testimonial")
    public String testimonial(Model model) {
        return "testimonial";
    }

}
