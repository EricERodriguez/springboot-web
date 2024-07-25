package com.eric.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eric.springboot.webapp.springboot_web.model.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details() {
        User user = new User("Andres", "Guzman");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo spring");
        // body.put("user", user);
        body.put("user", user);

        return body;
    }
}
