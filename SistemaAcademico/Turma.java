package SistemaAcademico;

import java.util.HashSet;

public class Turma {
    private HashSet<Aluno> alunos;
    private Disciplina disciplina;
    private Professor professor;
    private String codigo;
    private String horario;

    public int calcula_medias(){return 0;}


    public Turma() {
    }

    public Turma(HashSet<Aluno> alunos, Disciplina disciplina, Professor professor, String codigo, String horario) {
        this.alunos = alunos;
        this.disciplina = disciplina;
        this.professor = professor;
        this.codigo = codigo;
        this.horario = horario;
    }

    public HashSet<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(HashSet<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Turma alunos(HashSet<Aluno> alunos) {
        this.alunos = alunos;
        return this;
    }

    public Turma disciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
        return this;
    }

    public Turma professor(Professor professor) {
        this.professor = professor;
        return this;
    }

    public Turma codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public Turma horario(String horario) {
        this.horario = horario;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " alunos='" + getAlunos() + "'" +
            ", disciplina='" + getDisciplina() + "'" +
            ", professor='" + getProfessor() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", horario='" + getHorario() + "'" +
            "}";
    }

}
