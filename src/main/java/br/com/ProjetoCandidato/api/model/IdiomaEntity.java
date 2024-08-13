package br.com.ProjetoCandidato.api.model;

import br.com.ProjetoCandidato.core.enums.NivelIdiomaEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_IDIOMA")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
