package br.com.joguefacil.cadastro.utils;

import br.com.joguefacil.cadastro.entity.ClienteEntity;
import br.com.joguefacil.cadastro.entity.dto.ClienteInputDTO;

public class ClienteMapper {

    public static ClienteEntity toEntity(ClienteInputDTO dto) {
        ClienteEntity entity = new ClienteEntity();
        entity.setNome(dto.getNome());
        entity.setEmail(dto.getEmail());
        entity.setTelefone(dto.getTelefone());
        entity.setCpfCnpj(dto.getCpfCnpj());
        entity.setDataNascimento(dto.getDataNascimento());
        entity.setNomeSocial(dto.getNomeSocial() == null || dto.getNomeSocial().isBlank() ? dto.getNome() : dto.getNomeSocial());
        return entity;
    }
}
