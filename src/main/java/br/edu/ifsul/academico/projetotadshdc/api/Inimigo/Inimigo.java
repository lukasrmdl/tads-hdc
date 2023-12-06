package br.edu.ifsul.academico.projetotadshdc.api.Inimigo;
import br.edu.ifsul.academico.projetotadshdc.api.Ator.Ator;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "inimigo", schema = "tads_hdc", catalog = "")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inimigo extends Ator {

    private Integer tipo; // removido o atributo "efeito"

    private Integer alcance;  // antigo "distancia"

    private Integer valor;

    private Boolean esta_morto;

}


