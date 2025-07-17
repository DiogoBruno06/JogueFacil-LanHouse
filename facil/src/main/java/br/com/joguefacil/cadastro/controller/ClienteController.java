package br.com.joguefacil.cadastro.controller;

import br.com.joguefacil.cadastro.entity.ClienteEntity;
import br.com.joguefacil.cadastro.entity.dto.ClienteInputDTO;
import br.com.joguefacil.cadastro.kafka.ClienteProducer;
import br.com.joguefacil.cadastro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    @Autowired
    private ClienteProducer clienteProducer;


    @PostMapping("/create")
    public ResponseEntity<ClienteEntity> createCliente(ClienteInputDTO cliente) {
        clienteProducer.sendMessage("joguefacil","mensagem");
        return new ResponseEntity<>(clienteService.create(cliente), HttpStatus.CREATED);
    }


    @GetMapping("/findAll")
    public ResponseEntity<List<ClienteEntity>> findAll() {
        return new ResponseEntity<>(clienteService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findById/{idCliente}")
    public ResponseEntity<ClienteEntity> findById(@PathVariable Long idCliente) {
        return new ResponseEntity<>(clienteService.findById(idCliente), HttpStatus.OK);
    }

    @GetMapping("/findByCpfCnpj/{numCpfCnpj}")
    public ResponseEntity<ClienteEntity> findById(@PathVariable String numCpfCnpj) {
        return new ResponseEntity<>(clienteService.findByCpfCnpj(numCpfCnpj), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ClienteEntity> update(@RequestBody ClienteInputDTO cliente) {
        return new ResponseEntity<>(clienteService.update(cliente), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idCliente}")
    public void delete(@PathVariable Long idCliente) {
        clienteService.delete(idCliente);
    }
}
