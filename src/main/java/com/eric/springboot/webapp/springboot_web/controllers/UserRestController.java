package com.eric.springboot.webapp.springboot_web.controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eric.springboot.webapp.springboot_web.model.User;
import com.eric.springboot.webapp.springboot_web.model.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        UserDto userDto = new UserDto();
        User user = new User("Andres", "Guzman");

        userDto.setUser(user);
        userDto.setTitle("Hola mundo spring");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Andres", "Guzman");
        User user2 = new User("pepe", "234");
        User user3 = new User("sasr", "werwe");
        User user4 = new User("acvasd", "dsgsdg");

        List<User> users = Arrays.asList(user, user2, user3, user4);
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);
        // users.add(user4);

        return users;
    }

    @GetMapping("/details-map")
    public Map<String, Object> details2() {
        User user = new User("Andres", "Guzman");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo spring");
        body.put("user", user);

        return body;
    }
}
