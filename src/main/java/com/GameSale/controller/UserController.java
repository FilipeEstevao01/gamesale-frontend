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
    @GetMapping
    public Boolean findAllById(Integer id) {
        return userService.findAllById(id);
    }

    //Aqui e a ação determinada de verificar os ID Service
    @GetMapping("/{id}/exists")
    public boolean existsById(@PathVariable Integer id) {
        return userService.existsById(id);
    }

    //Aqui e a ação de deletar ID da service
    @DeleteMapping("/{id}delete")
    public void deleteById(Integer id) {
        userService.deleteById(id);
    }

    //NOME

    //Aqui e a ação determinada da Service para buscar por nome
    @GetMapping
    public String findAllNome(String nome) {
        return userService.findAllByNome(nome);
    }

    //Aqui e a ação determinada de verificar os nome Service
    @GetMapping
    public String existsByNome(String nome) {
        return userService.findAllByNome(nome);
    }

    //Aqui e a ação de deletar nome da service
    @DeleteMapping
    public void deleByNome(String nome) {
        userService.deleteByNome(nome);
    }
}
