package br.com.ProjetoCandidato.core.repository;


import br.com.ProjetoCandidato.api.model.CandidatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CandidatoRepository extends JpaRepository<CandidatoEntity, Long> {

    Optional<CandidatoEntity> findByEmail(String email);
}
