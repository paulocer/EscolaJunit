package org.example.escola;

public class Notas {

    private Aluno aluno;
    private String disciplina;
    private int unidade;
    private int avaliacao;
    private float nota;

    public Notas() {
    }



    public Notas(Aluno aluno, String disciplina, int unidade, int avaliacao, float nota) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.unidade = unidade;
        this.avaliacao = avaliacao;
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }



}
