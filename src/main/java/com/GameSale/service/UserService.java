
//Na Service é onde normalmente colocamos as regras de negócio.

//Isso informa o pacote em que sua class esta localizada
package com.GameSale.service;


import com.GameSale.Application.repository.UsuarioRepository;
import com.GameSale.entity.Usuario;
import org.springframework.stereotype.Service;


// aqui com esta anotachion informo que essa class faz parde da camada de servicee quero que o spring gerencie ela.
@Service

// Aqui está declarando a class
public class UserService {

    //Meu UserService possui um UsuarioRepository para acessar os dados dos usuários.
    private final UsuarioRepository usuarioRepository;

    //Aqui esta o contrutor
    public UserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //Aqui foi criado o metodo buscar por e-mail
    public boolean buscarPorEmail(String email) {

        return usuarioRepository.findByEmail(email);
    }

    //Aqui e feito o cadastro de usuario
    public Usuario cadastrarUsuario(Usuario usuario) {

        //Agora vem a regra de de negocio
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

    //metodo para excluir usuario
    public  void excluir(Integer id) {

        Usuario usuario = buscarPorId(id);
        usuarioRepository.delete(usuario);
    }
}
