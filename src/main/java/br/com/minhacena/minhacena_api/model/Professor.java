package br.com.minhacena.minhacena_api.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_PROFESSOR")
@SequenceGenerator(name = "professor", sequenceName = "SQ_TB_PROFESSOR", allocationSize = 1)
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Professor {
    @Id
    @GeneratedValue(generator = "professor", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "RG", nullable = false, length = 12)
    private String rg;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "NOME_ESCOLA", nullable = false)
    private String nomeEscola;

    @Column(name = "CIDADE", nullable = false)
    private String cidade;

    @Column(name = "CONTATO", nullable = false)
    private String contato;

    @OneToMany(mappedBy = "professor")
    private List<Redacao> redacaos;


    public Professor(String nome, String rg, String email, String nomeEscola, String cidade, String contato) {
        this.nome = nome;
        this.rg = rg;
        this.email = email;
        this.nomeEscola = nomeEscola;
        this.cidade = cidade;
        this.contato = contato;
    }
}

