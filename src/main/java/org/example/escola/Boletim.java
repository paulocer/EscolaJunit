package org.example.escola;

import java.util.List;

public class Boletim {
    private Aluno aluno;
    private List<Notas> nota;
    private Float media;

    public Boletim() {
    }

    public Boletim(Aluno aluno, List<Notas> nota, Float media) {
        this.aluno = aluno;
        this.nota = nota;
        this.media = media;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Notas> getNota() {
        return nota;
    }

    public void setNota(List<Notas> nota) {
        this.nota = nota;
    }

    public Float getMedia() {
        return media;
    }

    public void setMedia(Float media) {
        this.media = media;
    }

    public Float calcularMediaAritmetica() {
        if (nota == null || nota.isEmpty()) {
            return 0.0f; // ou qualquer valor que faça sentido quando não há notas
        }

        float somaNotas = 0;
        for (Notas notas : nota) {
            somaNotas += notas.getNota();
        }

        return somaNotas / nota.size();
    }
}
