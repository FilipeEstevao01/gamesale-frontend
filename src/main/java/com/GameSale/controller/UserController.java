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

    //Aqui e a ação determinada da Service para buscar por ID
    @GetMapping("/{id}/find")
    public Boolean findAllById(Integer id) {
        return userService.findAllById(id);
    }

    //Aqui e a ação determinada de verificar os ID Service
    @GetMapping("/{id}/exists")
    public boolean existsById(@PathVariable Integer id) {
        return userService.existsById(id);
    }

    //Aqui e a ação de deletar ID da service
    @DeleteMapping("/{id}/delete")
    public void deleteById(Integer id) {
        userService.deleteById(id);
    }
    //Nome

    //Aqui e a ação determinada da Service para buscar por nome
    @GetMapping
    public void findAllNome(String nome) {
        userService.findAllNome(nome);
    }

    //Aqui e a ação determinada de verificar os nome Service
    @GetMapping
    public String existsByNome(String nome) {
        return userService.existsByNome(nome);
    }

    //Aqui e a ação de deletar nome da service
    @DeleteMapping
    public void deleteByNome(String nome) {
        userService.deleteByNome(nome);
    }
}
