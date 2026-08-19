
//Isso informa o pacote em que sua class esta localizada
package com.GameSale.service;

import com.GameSale.Application.repository.UsuarioRepository;
import com.GameSale.entity.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UsuarioRepository usuarioRepository;

    public UserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public boolean buscarPorEmail(String email) {

        return usuarioRepository.findByEmail(email);
    }

    public Usuario cadastrarUsuario(Usuario usuario) {

        if (usuarioRepository.findByEmail(usuario.getEmail())) {
            throw new RuntimeException("Email já cadastrado");
        }

        return usuarioRepository.save(usuario);
    }

    public Usuario buscarPorId(Integer id) {

        return usuarioRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Usuario não encontrado")
                        );
    }

    public  void excluir(Integer id) {

        Usuario usuario = buscarPorId(id);
        usuarioRepository.delete(usuario);
    }
}
