package br.com.ProjetoCandidato.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_CORRECOES")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CorrecoesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "COMENTARIO")
    private String comentario;

    @Column(name = "PONTUACAO")
    private float pontuacao;

    @Column(name = "DATA_HORA")
    private LocalDateTime dataHora;

    @OneToOne
    @JoinColumn(name = "resposta_usuario_id")
    private RespostasUsuarios respostasUsuarios;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private EmpresaEntity empresaEntity;
}
