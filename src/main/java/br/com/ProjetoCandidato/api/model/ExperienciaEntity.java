package br.com.ProjetoCandidato.api.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "TB_EXPERIENCIA")
public class ExperienciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "EMPRESA")
    private String empresa;

    @Column(name = "CARGO")
    private String cargo;

    @Column(name = "DATA_INICIO")
    private LocalDate dataInicio;

    @Column(name = "DATA_FIM")
    private LocalDate dataFim;

    @Column(name = "DESCRICAO")
    private String descricao;
}
