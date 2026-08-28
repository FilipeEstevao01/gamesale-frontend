package com.GameSale.controller;
import java.util.List;
import java.util.Optional;

import com.GameSale.DTO.UsuarioRequestDTO;
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
    @GetMapping("/{id}")
    public Optional<Usuario> findById(@PathVariable Integer id) {
        return userService.findById(id);
    }

    //Aqui e a ação determinada de verificar os ID Service
    @GetMapping("/{id}/exists")
    public boolean existsById(@PathVariable Integer id) {
        return userService.existsById(id);
    }

    //Aqui e a ação de deletar ID da service
    @GetMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        userService.deleteById(id);
    }

    //Nome

    @GetMapping("/nome/{nome}")
    public List<Usuario> findAllByNome(@PathVariable String nome) {
        return userService.findAllByNome(nome);
    }

    @GetMapping("/nome/{name}/exists")
    public Boolean existsNome(@PathVariable String nome) {
        return userService.existsByNome(nome);
    }

    @DeleteMapping("/nome/{name}")
    public void deleteByNome(@PathVariable String nome) {
        userService.deleteByNome(nome);
    }

    //E-mail

    @GetMapping("/email/{email}")
    public Optional<Usuario> findAllEmail(@PathVariable String email) {
        return userService.findAllByEmail(email);
    }

    @GetMapping("/email/{email}/exists")
    public Boolean existsEmail(@PathVariable String email) {
        return userService.existsByEmail(email);
    }

    @DeleteMapping("/email/{email}")
    public void deleteByEmail (@PathVariable String email) {
        userService.deleteByEmail(email);
    }
}
