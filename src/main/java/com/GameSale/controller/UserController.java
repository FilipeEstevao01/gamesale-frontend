package com.GameSale.controller;


import com.GameSale.entity.Usuario;
import com.GameSale.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Usuario> findAll() {
        return userService.findAll();
    }

    @GetMapping("/email/{email}")
    public String findByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    @GetMapping("/name/{name}")
    public String findByname(@PathVariable String name) {
        return userService.findByEmail(name);
    }

    @DeleteMapping("/email/{email}")
        public void deleteByEmail (@PathVariable String email) {
        userService.deleteByEmail(email);
    }

}
