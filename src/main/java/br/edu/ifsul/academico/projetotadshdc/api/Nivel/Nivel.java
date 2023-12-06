package br.edu.ifsul.academico.projetotadshdc.api.Nivel;

import br.edu.ifsul.academico.projetotadshdc.api.Heroi.Heroi;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "nivel", schema = "tads_hdc", catalog = "")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nivel_id;
    private Integer nivel_atual;

    private Integer ultimo_nivel;

    private Integer nivel_total;

    @OneToOne(mappedBy = "nivel")
    private Heroi heroi;
}

