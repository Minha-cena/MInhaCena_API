package br.com.minhacena.minhacena_api.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TB_ILUSTRACAO")
@SequenceGenerator(name = "ilustracao", sequenceName = "SQ_TB_ILUSTRACAO", allocationSize = 1)
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Ilustracao {
    @Id
    @GeneratedValue(generator = "ilustracao", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Titulo", nullable = false)
    private String titulo;

    @Column(name = "IMAGEM_BYTE", nullable = false)
    private byte[] imageByte;

    @Column(name = "ILUSTRADOR_NOME", nullable = false)
    private String nomeIlustrador;

    @Column(name = "TEMA_REDACAO", nullable = false)
    private String temaRedacao;

    @ManyToOne
    @JoinColumn(name = "FK_REDACAO")
    private Redacao redacao;

    @ManyToOne
    @JoinColumn(name = "FK_ILUSTRADOR")
    private Ilustrador ilustrador;

    public Ilustracao(String titulo, byte[] imageByte, String nomeIlustrador, String temaRedacao, Redacao redacao, Ilustrador ilustrador) {
        this.titulo = titulo;
        this.imageByte = imageByte;
        this.nomeIlustrador = nomeIlustrador;
        this.temaRedacao = temaRedacao;
        this.redacao = redacao;
        this.ilustrador = ilustrador;
    }

    public Long getIlustradorId(){
        return this.ilustrador.getId();
    }

    public Long getRedacaoId(){
        return this.redacao.getId();
    }
}
