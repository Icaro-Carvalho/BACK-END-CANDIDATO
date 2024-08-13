package br.com.ProjetoCandidato.api.model;

import br.com.ProjetoCandidato.core.enums.NivelIdiomaEnum;
import jakarta.persistence.*;

@Entity(name = "TB_IDIOMA")
public class IdiomaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "IDIOMA")
    private String idioma;

    @Column(name = "NIVEL")
    private NivelIdiomaEnum nivel;
}
