package br.com.joguefacil.cadastro.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ClienteOutputDTO extends ClienteInputDTO{
    private Long idCliente;
}
