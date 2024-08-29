package br.com.ProjetoCandidato.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TB_EMPRESA")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    @NotBlank
    private String nome;

    @Column(name = "EMAIL")
    @NotBlank
    private String email;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "CNPJ", unique = true)
    private String cnpj;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private Set<VagaEntity> vaga = new HashSet<>();
}
