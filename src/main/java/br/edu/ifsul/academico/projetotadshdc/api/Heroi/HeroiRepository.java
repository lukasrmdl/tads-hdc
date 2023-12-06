package br.edu.ifsul.academico.projetotadshdc.api.Heroi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface
HeroiRepository extends JpaRepository<Heroi, Long> {
}
