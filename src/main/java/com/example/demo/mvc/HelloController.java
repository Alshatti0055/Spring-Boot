package com.example.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String helloPage(Model model) {
        model.addAttribute("name", "Abdul Alshatti");
        return "hello"; // wird hello.ftl unter templates aufrufen
    }
}

// Model - View - Controller = mvc
