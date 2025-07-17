package br.com.joguefacil.lanhouse.entity.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClienteEntity {
    private Long idClient;
    private String nome;
    private LocalDate dataNascimento;
    private String cpfCnpj;
    private String telefone;
    private String email;
    private String nomeSocial;
}
