package br.com.minhacena.minhacena_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Calendar;

public class CreateIlustradorDTO {
    @JsonProperty("Nome Ilustrador")
    private String nome;

    @JsonProperty("RG:")
    private String rg;

    @JsonProperty("Data nascimento")
    private Calendar dataNasc;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Link do portifolio")
    private String linkPortifolio;

    @JsonProperty("Redes sociais")
    private String redesSociais;

    @JsonProperty("Telefone")
    private String telefone;
}
