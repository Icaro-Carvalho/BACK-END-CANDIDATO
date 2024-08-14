package br.com.ProjetoCandidato.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TB_CANDIDATO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany
    @JoinColumn(name = "cursoCertificado_id")
    private Set<CursoCertificadoEntity> cursoCertificado = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "experiencia_id")
    private Set<ExperienciaEntity> experiencia = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "formacao_id")
    private Set<FormacaoEntity> formacao = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "idioma_id")
    private Set<IdiomaEntity> idioma = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "vaga_id")
    private VagaEntity vaga;



}
