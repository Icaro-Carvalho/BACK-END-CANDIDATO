package br.com.ProjetoCandidato.api.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AcessVO {

    private String token;

    //TODO implementar retornar o usuario e liberações (authorities)
}
