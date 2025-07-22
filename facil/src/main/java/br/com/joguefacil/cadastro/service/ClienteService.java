package br.com.joguefacil.cadastro.service;

import br.com.joguefacil.cadastro.entity.ClienteEntity;
import br.com.joguefacil.cadastro.entity.dto.ClienteInputDTO;
import br.com.joguefacil.cadastro.exception.CadastroException;
import br.com.joguefacil.cadastro.repository.ClienteRepository;
import br.com.joguefacil.cadastro.utils.ClienteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteEntity create(ClienteInputDTO cliente) {
        String cpfCnpj = cliente.getCpfCnpj();

        if (cpfCnpj == null || cpfCnpj.isBlank()) {
            throw new CadastroException("CPF/CNPJ é obrigatório.");
        }

        clienteRepository.findByCpfCnpj(cpfCnpj).ifPresent(c -> {
            throw new CadastroException("Já existe um cliente com o CPF/CNPJ informado.");
        });

        ClienteEntity novoCliente = ClienteMapper.toEntity(cliente);

        String nomeSocial = cliente.getNomeSocial();
        if (nomeSocial == null || nomeSocial.isBlank()) {
            novoCliente.setNomeSocial(cliente.getNome());
        }

        return clienteRepository.save(novoCliente);
    }


    public List<ClienteEntity> findAll() {
        return clienteRepository.findAll();
    }

    public ClienteEntity findById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public ClienteEntity findByCpfCnpj(String cpfCnpj) {
        return clienteRepository.findByCpfCnpj(cpfCnpj)
                .orElseThrow(() -> new CadastroException("Cliente com CPF/CNPJ " + cpfCnpj + " não encontrado."));
    }

    public ClienteEntity update(ClienteInputDTO cliente) {
        return clienteRepository.save(ClienteMapper.toEntity(cliente));
    }

    public void delete(Long idCliente) {
        clienteRepository.deleteById(idCliente);
    }
}
