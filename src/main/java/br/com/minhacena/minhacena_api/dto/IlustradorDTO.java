package br.com.minhacena.minhacena_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Calendar;

@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class IlustradorDTO {

    private Long id;

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
