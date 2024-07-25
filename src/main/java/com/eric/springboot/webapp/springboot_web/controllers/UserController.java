package com.eric.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eric.springboot.webapp.springboot_web.model.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("Andres", "Guzman");
        model.addAttribute("title", "Hola mundo spring");
        model.addAttribute("user", user);

        return "details";
    }
}
