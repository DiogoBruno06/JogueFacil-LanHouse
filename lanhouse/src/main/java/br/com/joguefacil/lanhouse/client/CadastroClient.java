package br.com.joguefacil.lanhouse.client;

import br.com.joguefacil.lanhouse.entity.dto.ClienteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cadastro-service", url = "http://localhost:8080")
public interface CadastroClient {

    @GetMapping("/cliente/findByCpfCnpj/{numCpfCnpj}")
    ClienteDTO findByCpfCnpj(@PathVariable ("numCpfCnpj") String numCpfCnpj);
}
