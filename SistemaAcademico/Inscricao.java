package SistemaAcademico;

import java.util.HashSet;

public class Inscricao {
    
    private Aluno alunoAtual;
    private HashSet<Turma> turmas;

    public Inscricao() {
    }

    public Inscricao(Aluno alunoAtual, HashSet<Turma> turmas) {
        this.alunoAtual = alunoAtual;
        this.turmas = turmas;
    }

    public Aluno getAlunoAtual() {
        return this.alunoAtual;
    }

    public void setAlunoAtual(Aluno alunoAtual) {
        this.alunoAtual = alunoAtual;
    }

    public HashSet<Turma> getTurmas() {
        return this.turmas;
    }

    public void setTurmas(HashSet<Turma> turmas) {
        this.turmas = turmas;
    }

    public Inscricao alunoAtual(Aluno alunoAtual) {
        this.alunoAtual = alunoAtual;
        return this;
    }

    public Inscricao turmas(HashSet<Turma> turmas) {
        this.turmas = turmas;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " alunoAtual='" + getAlunoAtual() + "'" +
            ", turmas='" + getTurmas() + "'" +
            "}";
    }
    
    
}
