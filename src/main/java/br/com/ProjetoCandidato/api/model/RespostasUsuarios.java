package br.com.ProjetoCandidato.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_RESPOSTAS_USUARIOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RespostasUsuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "RESPOSTA_TEXTO")
    private String respostaTexto;

    @Column(name = "DATA_HORA_RESPOSTA")
    private LocalDateTime dataHoraResposta;

    @Column(name = "PONTUACAO")
    private float pontuacao;

    @OneToOne
    @JoinColumn(name = "candidato_id")
    private CandidatoEntity candidato;

    @ManyToOne
    @JoinColumn(name = "prova_id")
    private ProvaEntity prova;

    @OneToOne
    @JoinColumn(name = "pergunta_id")
    private PerguntasEntity pergunta;

    @OneToOne
    @JoinColumn(name = "opcoes_respostas_id")
    private OpcoesRespostas opcoesRespostas;
}
