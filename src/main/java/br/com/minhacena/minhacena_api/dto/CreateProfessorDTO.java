package br.com.minhacena.minhacena_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateProfessorDTO {
    @JsonProperty("Nome")
    private String nome;

    @JsonProperty("RG")
    private String rg;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Nome da escola: ")
    private String nomeEscola;

    @JsonProperty("Cidade: ")
    private String cidade;

    @JsonProperty("Contato: ")
    private String contato;
}
