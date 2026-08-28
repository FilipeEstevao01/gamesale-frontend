package com.GameSale.service;

import com.GameSale.DTO.UsuarioRequestDTO;
import com.GameSale.entity.Usuario;
import com.GameSale.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    private final UsuarioRepository usuarioRepository;


    public UserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //CREAT

    public Usuario create(UsuarioRequestDTO dto) {

        Usuario usuario = new Usuario();

        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());

        return usuarioRepository.save(usuario);
    }

    //ID

    //Aqui e a requisição para buscar todos
    public Optional<Usuario> findById(Integer id) {
        return usuarioRepository.findById(id);
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
    public List<Usuario> findAllByNome(String nome) {
        return usuarioRepository.findAllByNome(nome);
    }

    public Boolean existsByNome(String nome) {
        return usuarioRepository.existsByNome(nome);
    }

    public void deleteByNome(String nome) {
        usuarioRepository.deleteByNome(nome);
    }

    //E-mail

    public Optional<Usuario> findAllByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    public Boolean existsByEmail(String email) {
        return usuarioRepository.existsByEmail(email);
    }

    public void deleteByEmail(String email) {
        usuarioRepository.deleteByEmail(email);
    }
}

