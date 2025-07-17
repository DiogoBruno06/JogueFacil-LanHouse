package br.com.joguefacil.lanhouse.entity.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDTO {
    private String nome;
    private LocalDate dataNascimento;
    private String cpfCnpj;
    private String telefone;
    private String email;
    private String nomeSocial;
}
