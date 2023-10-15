package org.example.escola;

import java.util.List;


public class Turmas {
    private String nome;
    private String sala;
    private String horario;
    private Integer ano;
    private List<Aluno> alunos;
    private List<Disciplinas> disciplinas;

    public Turmas() {
    }

    public Turmas(String nome, String sala, String horario, Integer ano, List<Aluno> alunos, List<Disciplinas> disciplinas) {
        this.nome = nome;
        this.sala = sala;
        this.horario = horario;
        this.ano = ano;
        this.alunos = alunos;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplinas> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
