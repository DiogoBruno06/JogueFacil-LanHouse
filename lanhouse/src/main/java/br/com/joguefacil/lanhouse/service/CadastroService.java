package br.com.joguefacil.lanhouse.service;

import br.com.joguefacil.lanhouse.client.CadastroClient;
import br.com.joguefacil.lanhouse.entity.dto.ClienteDTO;
import br.com.joguefacil.lanhouse.entity.model.ComandaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastroService {

    private final CadastroClient client;

    public ClienteDTO findCliente(String cpfCnpj){
        return client.findByCpfCnpj(cpfCnpj);
    }

}
