package com.GameSale.service;

import com.GameSale.repository.UsuarioRepository;
import com.GameSale.entity.Usuario;
import jakarta.persistence.Id;
import org.hibernate.Internal;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class UserService {

    private final UsuarioRepository usuarioRepository;

    public UserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //ID

    //Aqui e a requisição para buscar todos
    public Boolean findAllById(Integer id) {
        return usuarioRepository.findAllById(id);
    }

    //Aqui e a requisição para verificar a existencias de mais de um ID
    public boolean existsById(Integer id) {
        return usuarioRepository.existsById(id);
    }

    //Aqui a requisição para deletar por ID
    public void deleteById(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
