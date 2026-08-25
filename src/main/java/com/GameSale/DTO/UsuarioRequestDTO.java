package com.GameSale.DTO;



import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioRequestDTO {



    private String nome;

    private String email;

    private String senha;
}
