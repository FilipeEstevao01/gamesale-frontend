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
    @GetMapping("/{id}delete")
    public void deleteById(Integer id) {
        userService.deleteById(id);
    }

    //Nome

    @GetMapping
    public void findAllNome(String nome) {
        userService.findAllByNome(nome);
    }

    @GetMapping
    public void existsNome(String nome) {
        userService.existsByNome(nome);
    }

    @DeleteMapping
    public void deleteByNome(String nome) {
        userService.deleteByNome(nome);
    }

    //E-mail

    @GetMapping
    public void findAllEmail(String email) {
        userService.findAllByEmail(email);
    }

    @GetMapping
    public void existsEmail(String email) {
        userService.existsByAllEmail(email);
    }

    @DeleteMapping
    public void deleteByEmail (String email) {
        userService.deleteByEmail(email);
    }
}
