package com.GameSale.service;

import com.GameSale.Application.repository.UsuarioRepository;
import com.GameSale.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    // Aqui criando uma variavel.
    // O usuario e que converça com o banco.

    private UsuarioRepository usuarioRepository;

    //Isso e a injeção de dependecias por construtor

    public UserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //O public esta falando basicamente que esta class pode ser usada em outras class
    public Usuario getusuarioBySenha(String senha) {


        return (Usuario) usuarioRepository.findByEmail(senha)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }


}
