package br.com.minhacena.minhacena_api.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "TB_ILUSTRADOR")
@SequenceGenerator(name = "ilustrador", sequenceName = "SQ_TB_ILUSTRADOR", allocationSize = 1)
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Ilustrador {
    @Id
    @GeneratedValue(generator = "ilustrador", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "RG", nullable = false, length = 13)
    private String rg;

    @Column(name = "DATA_NASC", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataNasc;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name="LINK_PORTIFOLIO")
    private String linkPortifolio;

    @Column(name = "REDES_SOCIAIS")
    private String redesSociais;

    @Column(name = "TELEFONE", nullable = false)
    private String telefone;

    @OneToMany(mappedBy = "ilustrador")
    private List<Ilustracao> ilustracaos;

    public Ilustrador(String nome, String rg, Calendar dataNasc, String email, String linkPortifolio, String redesSociais, String telefone) {
        this.nome = nome;
        this.rg = rg;
        this.dataNasc = dataNasc;
        this.email = email;
        this.linkPortifolio = linkPortifolio;
        this.redesSociais = redesSociais;
        this.telefone = telefone;
    }
}
