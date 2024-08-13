package br.com.ProjetoCandidato.api.model;

import br.com.ProjetoCandidato.core.enums.GrauFormacaoEnum;
import br.com.ProjetoCandidato.core.enums.StatusFormacaoEnum;
import br.com.ProjetoCandidato.core.enums.TipoFormacaoEnum;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "TB_FORMACAO")
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
    private TipoFormacaoEnum tipo;

    @Column(name = "GRAU")
    private GrauFormacaoEnum grau;

    @Column(name = "STATUS")
    private StatusFormacaoEnum status;

}
