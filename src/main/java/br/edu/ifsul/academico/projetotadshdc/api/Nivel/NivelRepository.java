package br.edu.ifsul.academico.projetotadshdc.api.Nivel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelRepository extends JpaRepository<Nivel, Long> {
}
