package br.com.joguefacil.lanhouse.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ComandaInputDTO {
    private Long idComanda;
    private String numCpjCnpj;
}
