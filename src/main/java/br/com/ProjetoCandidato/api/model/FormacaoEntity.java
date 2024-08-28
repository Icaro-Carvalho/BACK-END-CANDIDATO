package br.com.ProjetoCandidato.api.model;

import br.com.ProjetoCandidato.core.enums.GrauFormacaoEnum;
import br.com.ProjetoCandidato.core.enums.StatusFormacaoEnum;
import br.com.ProjetoCandidato.core.enums.TipoFormacaoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "TB_FORMACAO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FormacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "INSTITUICAO")
    private String instituicao;

    @Column(name = "CURSO")
    private String curso;

    @Column(name = "DATA_INICIO")
    private LocalDate dataInicio;

    @Column(name = "DATA_FIM")
    private LocalDate dataFim;

    @Column(name = "TIPO")
    @Enumerated(EnumType.STRING)
    private TipoFormacaoEnum tipo;

    @Column(name = "GRAU")
    @Enumerated(EnumType.STRING)
    private GrauFormacaoEnum grau;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private StatusFormacaoEnum status;

}
