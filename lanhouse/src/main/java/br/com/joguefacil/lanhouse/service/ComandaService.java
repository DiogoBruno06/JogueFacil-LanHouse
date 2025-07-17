package br.com.joguefacil.lanhouse.service;

import br.com.joguefacil.lanhouse.client.CadastroClient;
import br.com.joguefacil.lanhouse.entity.dto.ComandaInputDTO;
import br.com.joguefacil.lanhouse.entity.model.ComandaEntity;
import br.com.joguefacil.lanhouse.repository.ComandaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComandaService {

    private final ComandaRepository comandaRepository;
    private final CadastroClient client;

    public ComandaEntity findComanda(Long idComanda){
        return comandaRepository.findByIdComanda(idComanda);
    }

    public ComandaEntity createComanda(ComandaInputDTO comandaInputDTO){
        var clienteComanda = client.findByCpfCnpj(comandaInputDTO.getNumCpjCnpj());

        var comandaEntity = ComandaEntity.novaComanda();
        comandaEntity.setNomeCliente(clienteComanda.getNome());
        return comandaRepository.save(comandaEntity);
    }

    public void deleteComanda(Long idComanda){
        comandaRepository.deleteById(idComanda);
    }
}
