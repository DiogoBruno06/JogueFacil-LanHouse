package br.com.joguefacil.lanhouse.controller;

import br.com.joguefacil.lanhouse.entity.dto.ClienteDTO;
import br.com.joguefacil.lanhouse.entity.dto.ComandaInputDTO;
import br.com.joguefacil.lanhouse.entity.model.ComandaEntity;
import br.com.joguefacil.lanhouse.entity.model.EstoqueEntity;
import br.com.joguefacil.lanhouse.service.CadastroService;
import br.com.joguefacil.lanhouse.service.ComandaService;
import br.com.joguefacil.lanhouse.service.EstoqueService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/LANHOUSE")
public class LanhouseController {

    @Autowired
    private CadastroService cadastroService;

    @Autowired
    private EstoqueService estoqueService;

    @Autowired
    private ComandaService comandaService;

    @GetMapping("/findCliente")
    public ClienteDTO clienteDTO(String numCpfCnpj){
        return cadastroService.findCliente(numCpfCnpj);
    }

    @PostMapping("/cadastro-estoque")
    public ResponseEntity<EstoqueEntity> cadastroProdutoEstoque(EstoqueEntity entity) {
        return new ResponseEntity<>(estoqueService.createProduto(entity), HttpStatus.CREATED);
    }

    @PostMapping("/cadastro-comanda")
    public ResponseEntity<ComandaEntity> cadastroComanda(ComandaInputDTO entity) {
        return new ResponseEntity<>(comandaService.createComanda(entity), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleta-comanda")
    public void deletarComanda(Long idComanda){
        comandaService.deleteComanda(idComanda);
    }

}
