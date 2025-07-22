package br.com.joguefacil.lanhouse.service;

import br.com.joguefacil.lanhouse.entity.model.EstoqueEntity;
import br.com.joguefacil.lanhouse.repository.EstoqueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstoqueService {

    private final EstoqueRepository estoqueRepository;

    public EstoqueEntity createProduto(EstoqueEntity estoque){
        return estoqueRepository.save(estoque);
    }

    public List<EstoqueEntity> getAllEstoque(){
        return estoqueRepository.findAll();
    }

    public Optional<EstoqueEntity> getEstoque(Long id){
        return estoqueRepository.findById(id);
    }

    public void deleteEstoque(Long id){
        estoqueRepository.deleteById(id);
    }
}
