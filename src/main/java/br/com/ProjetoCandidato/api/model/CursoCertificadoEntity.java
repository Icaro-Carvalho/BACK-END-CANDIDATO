package br.com.ProjetoCandidato.api.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "TB_CURSOS_CERTIFICADOS")
public class CursoCertificadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "INSTITUICAO")
    private String instituicao;

    @Column(name = "DATA_CONCLUSAO")
    private LocalDate dataConclusao;

    @Column(name = "DESCRICAO")
    private String descricao;
}
