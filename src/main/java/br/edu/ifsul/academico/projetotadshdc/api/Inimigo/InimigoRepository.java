package br.edu.ifsul.academico.projetotadshdc.api.Inimigo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InimigoRepository extends JpaRepository<Inimigo, Long> {
}
