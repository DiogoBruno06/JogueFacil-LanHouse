package br.com.joguefacil.cadastro.repository;

import br.com.joguefacil.cadastro.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    Optional<ClienteEntity> findByCpfCnpj(String cpfCnpj);
}
