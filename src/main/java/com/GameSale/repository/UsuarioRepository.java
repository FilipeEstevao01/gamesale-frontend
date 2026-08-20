package com.GameSale.repository;

import com.GameSale.entity.Usuario;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface  UsuarioRepository  extends JpaRepository<Usuario, Integer> {


    void findNameByName(String name);

    String existsByEmail(String email);

    String findByEmail(String email);

    List<Usuario> findByNomeContainingOrderByNomeAsc(String nome);

    List<Usuario> findByNomeContaining(String nome);

    List<Usuario> findByNomeStartingWith(String name);

    void deleteByEmail(String email);
}
