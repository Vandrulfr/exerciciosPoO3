package SistemaAcademico;

import java.util.HashSet;

public class Aluno {
    private HashSet<Integer> notas;
    private String nome;
    private HashSet<Turma> turmas;
    private HashSet<Disciplina> disciplinasConcluidas;


    public void exibe_historico(){}
    public int nota_na_turma(Turma turma){return 0;}
    public int calcula_cr(){return 0;}


    public Aluno() {
    }

    public Aluno(HashSet<Integer> notas, String nome, HashSet<Turma> turmas, HashSet<Disciplina> disciplinasConcluidas) {
        this.notas = notas;
        this.nome = nome;
        this.turmas = turmas;
        this.disciplinasConcluidas = disciplinasConcluidas;
    }

    public HashSet<Integer> getNotas() {
        return this.notas;
    }

    public void setNotas(HashSet<Integer> notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashSet<Turma> getTurmas() {
        return this.turmas;
    }

    public void setTurmas(HashSet<Turma> turmas) {
        this.turmas = turmas;
    }

    public HashSet<Disciplina> getDisciplinasConcluidas() {
        return this.disciplinasConcluidas;
    }

    public void setDisciplinasConcluidas(HashSet<Disciplina> disciplinasConcluidas) {
        this.disciplinasConcluidas = disciplinasConcluidas;
    }

    public Aluno notas(HashSet<Integer> notas) {
        this.notas = notas;
        return this;
    }

    public Aluno nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Aluno turmas(HashSet<Turma> turmas) {
        this.turmas = turmas;
        return this;
    }

    public Aluno disciplinasConcluidas(HashSet<Disciplina> disciplinasConcluidas) {
        this.disciplinasConcluidas = disciplinasConcluidas;
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " notas='" + getNotas() + "'" +
            ", nome='" + getNome() + "'" +
            ", turmas='" + getTurmas() + "'" +
            ", disciplinasConcluidas='" + getDisciplinasConcluidas() + "'" +
            "}";
    }
    
}
