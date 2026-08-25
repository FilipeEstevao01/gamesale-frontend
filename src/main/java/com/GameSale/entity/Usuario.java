package com.GameSale.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Integer id;
    private String nome;
    private String email;
    private String senha;

   public void save(Usuario usuario){
       this.setId(usuario.getId());
       this.setNome(usuario.getNome());
   }
}





