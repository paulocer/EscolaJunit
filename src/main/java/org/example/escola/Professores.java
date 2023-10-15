package org.example.escola;

import java.util.List;
public class Professores {

    private String nome;

    private List<Disciplinas> disciplinas;

    public Professores() {
    }
    public Professores(String nome, List<Disciplinas> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplinas> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
