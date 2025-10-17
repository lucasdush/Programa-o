package com.example.dushaula1.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsuarioRequestDTO {

    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 3,  message = "O nome deve ter no mínimo 3 caracteres")
    private String nome;
    
    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email inválido")
    private String email;

    @NotBlank(message = "Senha é obrigatória")
    @Size(min = 6, max = 20, message = "A senha deve ter no mínimo 6 caracteres")
    private String senha;


}