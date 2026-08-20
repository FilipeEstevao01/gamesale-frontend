package com.GameSale.controller;


import com.GameSale.entity.Usuario;
import com.GameSale.repository.UsuarioRepository;
import com.GameSale.service.UserService;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping()
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //ID

    @GetMapping
    public List<Usuario> finById(Integer id) {
        return userService.findById(id);
    }

}
