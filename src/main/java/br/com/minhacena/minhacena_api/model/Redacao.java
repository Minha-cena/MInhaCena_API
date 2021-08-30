package br.com.minhacena.minhacena_api.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_REDACAO")
@SequenceGenerator(name = "redacao", sequenceName = "SQ_TB_REDACAO", allocationSize = 1)
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Redacao {
    @Id
    @GeneratedValue(generator = "redacao", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name="TITULO", nullable = false)
    private String titulo;

    @Column(name = "REDACAO", nullable = false, length = 15000)
    private String redacao;

    @Column(name = "ALUNO", nullable = false)
    private String aluno;

    @Column(name = "IDADE", nullable = false)
    private Integer idade;

    @Column(name = "TURMA", nullable = false)
    private String turma;

    @Column(name = "TEMA_REDACAO", nullable = false)
    private String temaRedacao;

    @ManyToOne
    @JoinColumn(name = "FK_PROFESSOR")
    private Professor professor;

    @OneToMany(mappedBy = "redacao")
    private List<Ilustracao> ilustracaos;

    public Redacao(String titulo, String redacao, String aluno, Integer idade, String turma, String temaRedacao, Professor professor) {
        this.titulo = titulo;
        this.redacao = redacao;
        this.aluno = aluno;
        this.idade = idade;
        this.turma = turma;
        this.temaRedacao = temaRedacao;
        this.professor = professor;
    }

    public Long getProfessorId(){
        return this.professor.getId();
    }
}
