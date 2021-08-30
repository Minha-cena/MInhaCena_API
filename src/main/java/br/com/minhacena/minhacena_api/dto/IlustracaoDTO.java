package br.com.minhacena.minhacena_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class IlustracaoDTO {

    private Long id;

    @JsonProperty("Titulo")
    private String titulo;

    @JsonProperty("Imagem")
    private byte[] imageByte;

    @JsonProperty("Nome do ilustrador")
    private String nomeIlustrador;

    @JsonProperty("Tema da redacao")
    private String temaRedacao;

    @JsonProperty("Id da redacao")
    private Long redacao;

    @JsonProperty("Id do ilustrador")
    private Long ilustrador;
}
