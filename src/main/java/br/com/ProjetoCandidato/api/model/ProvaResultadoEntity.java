package br.com.ProjetoCandidato.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_PROVA_RESULTADO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProvaResultadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "PONTUACAO_TOTAL")
    private float pontuacaoTotal;

    @Column(name = "DATA_FINALIZACAO")
    private LocalDateTime dataFinalizacao;

    @OneToOne
    @JoinColumn(name = "prova_id")
    private  ProvaEntity prova;

    @OneToOne
    @JoinColumn(name = "candidato_id")
    private CandidatoEntity candidato;
}
