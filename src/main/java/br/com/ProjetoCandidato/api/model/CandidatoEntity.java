package br.com.ProjetoCandidato.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

@Entity(name = "TB_CANDIDATO")
public class CandidatoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME_COMPLETO")
    @NotBlank
    private String nomeCompleto;

    @Column(name = "CPF", length = 11)
    @NotBlank
    @CPF
    private String cpf;

    @Column(name = "EMAIL")
    @NotBlank
    private String email;

    @Column(name = "CELULAR", length = 9)
    @NotBlank
    private String celular;

    @Column(name = "CEP", length = 8)
    @NotBlank
    private String cep;

    @Column(name = "LOGRADOURO")
    @NotBlank
    private String logradouro;

    @Column(name = "ESTADO")
    @NotBlank
    private String estado;

    @Column(name = "CIDADE")
    @NotBlank
    private String cidade;

    @Column(name = "LINK_LINKEDIN")
    private String linkLinkedin;

    private CursoCertificadoEntity cursoCertificado;

    private ExperienciaEntity experiencia;

    private FormacaoEntity formacao;

    private IdiomaEntity idioma;



}
