package com.GameSale.controller;
import java.util.List;

import com.GameSale.entity.Usuario;

import com.GameSale.service.UserService;
import org.springframework.web.bind.annotation.*;


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
    public void findAllById(Integer id) {
        userService.findAllById(id);
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

    @GetMapping("/{name}find")
    public void findAllByNome(String nome) {
        userService.findAllByNome(nome);
    }

    @GetMapping("/{name}exists")
    public void existsNome(String nome) {
        userService.existsByNome(nome);
    }

    @DeleteMapping("/{name}delete")
    public void deleteByNome(String nome) {
        userService.deleteByNome(nome);
    }

    //E-mail

    @GetMapping("/{email}find")
    public void findAllEmail(String email) {
        userService.findAllByEmail(email);
    }

    @GetMapping("/{email}exists")
    public void existsEmail(String email) {
        userService.existsByAllEmail(email);
    }

    @DeleteMapping("/{email}delete")
    public void deleteByEmail (String email) {
        userService.deleteByEmail(email);
    }
}
