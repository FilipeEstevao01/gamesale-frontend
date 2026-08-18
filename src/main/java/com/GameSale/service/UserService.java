package com.GameSale.service;

import com.GameSale.Application.repository.UsuarioRepository;
import com.GameSale.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private UsuarioRepository usuarioRepository;

    public UserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public Usuario getusuarioBySenha(String senha) {
        return usuarioRepository.findBySenha(senha)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
