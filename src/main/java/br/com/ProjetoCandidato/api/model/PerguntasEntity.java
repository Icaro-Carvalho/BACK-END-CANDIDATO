package br.com.ProjetoCandidato.api.model;

import br.com.ProjetoCandidato.core.enums.TipoPerguntaEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_PERGUNTAS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PerguntasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TEXTO")
    @NotBlank
    private String texto;

    @Column(name = "TIPO_PERGUNTA")
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoPerguntaEnum tipoPergunta;

    @Column(name = "PONTUACAO")
    private float pontuacao;

    @ManyToOne
    @JoinColumn(name = "prova_id")
    private ProvaEntity prova;

}
