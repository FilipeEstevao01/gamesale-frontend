package com.GameSale.service;

import com.GameSale.entity.Usuario;
import com.GameSale.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    //nome

    //Aqui e a requisição para buscar todos
    public void findAllByNome(String nome) {
        usuarioRepository.findAllByNome(nome);
    }

    public void existsByNome(String nome) {
        usuarioRepository.existsByNome(nome);
    }

    public void deleteByNome(String nome) {
        usuarioRepository.deleteByNome(nome);
    }

    //E-mail

    public void findAllByEmail(String email) {
        usuarioRepository.findAllByNome(email);
    }

    public void existsByAllEmail(String email) {
        usuarioRepository.existsByEmail(email);
    }

    public void deleteByEmail(String email) {
        usuarioRepository.deleteByEmail(email);
    }
}

