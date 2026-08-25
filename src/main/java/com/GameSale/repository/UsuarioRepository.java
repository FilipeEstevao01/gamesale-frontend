package com.GameSale.repository;
import com.GameSale.entity.Usuario;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  UsuarioRepository  extends JpaRepository<Usuario, Integer> {

    //ID

    // Aqui busca todos pelo ID
    void findAllById(Integer id);

    // Aqui verifica se existe um usuario com mesmo ID
    boolean existsById(@NonNull Integer id);

    // Aqui e o deletar por ID
    void deleteById(@NonNull Integer id);


    //Nome

    void findAllByNome(String nome);

    void existsByNome(String nome);

    void deleteByNome(String nome);

    //E-mail

    void findAllEmail(String email);

    void existsByEmail(String email);

    void deleteByEmail(String email);
}
