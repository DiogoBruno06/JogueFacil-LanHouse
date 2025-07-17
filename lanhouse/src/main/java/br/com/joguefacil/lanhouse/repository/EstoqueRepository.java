package br.com.joguefacil.lanhouse.repository;

import br.com.joguefacil.lanhouse.entity.model.EstoqueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<EstoqueEntity, Long> {
}
