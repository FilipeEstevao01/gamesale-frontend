package com.GameSale.service;

import com.GameSale.DTO.UsuarioRequestDTO;
import com.GameSale.entity.Usuario;
import com.GameSale.repository.UsuarioRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {



    private final UsuarioRepository usuarioRepository;


    public void create(UsuarioRequestDTO dto) {
        Usuario usuario = new Usuario();

        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());

        usuario.save(usuario);
    }

    public UserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    //ID

    //Aqui e a requisição para buscar todos
    public void findAllById(Integer id) {
        usuarioRepository.findAllById(id);
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

