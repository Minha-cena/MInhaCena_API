package br.com.minhacena.minhacena_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class RedacaoDTO {

    private Long id;

    @JsonProperty("Titulo")
    private String titulo;

    @JsonProperty("Redacao")
    private String redacao;

    @JsonProperty("Nome do aluno")
    private String aluno;

    @JsonProperty("Idade do aluno")
    private String idade;

    @JsonProperty("Turma do aluno")
    private String turma;

    @JsonProperty("Tema da redacao")
    private String temaRedacao;

    @JsonProperty("Identificacao do Professor")
    private Long codigoProfessor;
}
