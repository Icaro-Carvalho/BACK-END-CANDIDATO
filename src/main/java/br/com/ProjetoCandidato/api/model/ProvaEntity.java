package br.com.ProjetoCandidato.api.model;

import br.com.ProjetoCandidato.core.enums.StatusProvaEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TB_PROVA_TECNICA")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProvaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITULO")
    @NotBlank
    private String titulo;

    @Column(name = "DESCRICAO")
    @NotBlank
    private String descricao;

    @Column(name = "DATA_CRIACAO")
    private LocalDateTime dataCriacao;

    @Column(name = "DATA_PUBLICACAO")
    private LocalDateTime dataPublicacao;

    @Column(name = "DATA_LIMITE")
    @NotNull
    private LocalDateTime dataLimite;

    @Column(name = "TEMPO_LIMITE")
    @NotNull
    private int tempoLimite;

    @Column(name = "STATUS")
    private StatusProvaEnum status;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "prova", fetch = FetchType.LAZY)
    private Set<PerguntasEntity> perguntas = new HashSet<>();
}
