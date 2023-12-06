package br.edu.ifsul.academico.projetotadshdc.api.Heroi;

import br.edu.ifsul.academico.projetotadshdc.api.Ator.Ator;
import br.edu.ifsul.academico.projetotadshdc.api.Nivel.Nivel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "heroi", schema = "tads_hdc", catalog = "")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Heroi extends Ator {

    private Boolean movendo;

    private Integer estado; // alterado de String para um Integer

    private Boolean Imune;  // antigo "intangivel"

    @OneToOne
    @JoinColumn(name = "nivel_id", referencedColumnName = "nivel_id", nullable = false)
    private Nivel nivel;

}


