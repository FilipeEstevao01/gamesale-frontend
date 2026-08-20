package com.GameSale.service;

import com.GameSale.repository.UsuarioRepository;
import com.GameSale.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UsuarioRepository usuarioRepository;

    public UserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Buscar usuário pelo email
    public String findByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    // Verificar se email já existe
    public String emailExist(String email) {
        return usuarioRepository.existsByEmail(email);
    }

    // Buscar usuários que contenham determinado nome
    public List<Usuario> findByName(String name) {
        return usuarioRepository.findByNomeContaining(name);
    }

    // Buscar usuários cujo nome começa com determinado texto
    public List<Usuario> findByNameStartingWith(String name) {
        return usuarioRepository.findByNomeStartingWith(name);
    }

    // Buscar por nome e ordenar alfabeticamente
    public List<Usuario> findByNameOrdered(String name) {
        return usuarioRepository.findByNomeContainingOrderByNomeAsc(name);
    }

    // Deletar Email
    public void deleteByEmail(String email) {
        usuarioRepository.deleteByEmail(email);
    }

    // Buscar todos
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }


}
