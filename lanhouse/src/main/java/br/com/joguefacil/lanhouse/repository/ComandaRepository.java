package br.com.joguefacil.lanhouse.repository;

import br.com.joguefacil.lanhouse.entity.model.ComandaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComandaRepository extends JpaRepository<ComandaEntity, Long> {
    ComandaEntity findByIdComanda(Long idComanda);
}
