package com.GameSale.repository;

import com.GameSale.entity.Usuario;

import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  UsuarioRepository  extends JpaRepository<Usuario, Integer> {

    //ID

    // Aqui busca todos pelo ID
    Boolean findAllById(Integer id);

    // Aqui verifica se existe um usuario com mesmo ID
    boolean existsById(@NonNull Integer id);

    // Aqui e o deletar por ID
    void deleteById(@NonNull Integer id);

    //NOME

    // Aqui busca todos pelo nome
    String findAllByNome(String Nome);

    // Aqui verifica se existe um usuario com mesmo nome
    String existsByNome(String nome);

    // Aqui e o deletar por nome
    void deleteByNome(String nome);
}
