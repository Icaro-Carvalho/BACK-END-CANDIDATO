package br.com.ProjetoCandidato.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_OPCOES_RESPOSTAS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OpcoesRespostas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TEXTO_OPCAO")
    @NotBlank
    private String textoOpcao;

    @Column(name = "CORRETA")
    private Boolean correta;

    @ManyToOne
    @JoinColumn(name = "pergunta_id")
    private PerguntasEntity pergunta;
}
