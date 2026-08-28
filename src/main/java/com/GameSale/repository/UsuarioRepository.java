package com.GameSale.repository;

import com.GameSale.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface  UsuarioRepository  extends JpaRepository<Usuario, Integer> {

    //ID

    // Aqui busca todos pelo ID
     Optional<Usuario> findById(Integer id);

    // Aqui verifica se existe um usuario com mesmo ID
    boolean existsById(Integer id);

    // Aqui e o deletar por ID
    void deleteById(Integer id);


    //Nome

   List<Usuario> findAllByNome(String nome);

    boolean existsByNome(String nome);

    void deleteByNome(String nome);

    //E-mail

    Optional<Usuario> findByEmail(String email);

    boolean existsByEmail(String email);

    void deleteByEmail(String email);
}
