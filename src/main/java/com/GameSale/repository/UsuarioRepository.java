package com.GameSale.repository;

import com.GameSale.entity.Usuario;
import java.util.List;
import java.util.Optional;

import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface  UsuarioRepository  extends JpaRepository<Usuario, Integer> {

    //ID

    List<Usuario> finById(Integer id);
}
