package br.edu.ifsul.academico.projetotadshdc.api.Ator;

//CRIAR BANCO DE DADOS tads_hdc e usuario lukas - senha5
// CREATE USER 'nome'@'localhost' IDENTIFIED BY 'senha'
// GRANT ALL PRIVILEGES ON *.* TO 'lukas'@'localhost'
// lombok, spring web, devtools, spring data jpa, maria db driver
// 2.7.15 snapshot, na aba do maven atualizar depois de mudar a versão no pom
//conectar banco maria db

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Ator {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id_ator;

    private String nome;

    private Integer altura;

    private Integer largura;

    private Integer velocidade;

    private Integer vida;

    private Integer armadura;

}
