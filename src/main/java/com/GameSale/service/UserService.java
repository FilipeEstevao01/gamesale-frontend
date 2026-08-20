package com.GameSale.service;

import com.GameSale.repository.UsuarioRepository;
import com.GameSale.entity.Usuario;
import jakarta.persistence.Id;
import org.hibernate.Internal;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UsuarioRepository usuarioRepository;

    public UserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //ID

    public List<Usuario> findById(Integer id) {
        return usuarioRepository.findAllById(id);
    }

}
