package SistemaAcademico;

import java.util.HashSet;

public class Professor {
    private HashSet<Turma> turmas;
    private String nome;


    public Professor() {
    }

    public HashSet<Turma> getTurmas() {
        return this.turmas;
    }

    public void setTurmas(HashSet<Turma> turmas) {
        this.turmas = turmas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor(HashSet<Turma> turmas, String nome) {
        this.turmas = turmas;
        this.nome = nome;
    }

}
