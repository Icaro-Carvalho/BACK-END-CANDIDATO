package br.com.ProjetoCandidato.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "TB_CURSOS_CERTIFICADOS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
