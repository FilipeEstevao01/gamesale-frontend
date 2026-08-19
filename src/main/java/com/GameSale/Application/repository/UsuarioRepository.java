package com.GameSale.Application.repository;

import com.GameSale.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    boolean findByEmail(String senha);

}
