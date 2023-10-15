package org.example;

import org.example.escola.Disciplinas;
import org.example.escola.Professores;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfessoresTest {

    private Professores professores;

    @BeforeEach
    public void criarObjetoProfessores() {
        professores = new Professores();
    }

    @Test
    public void testGetNome() {

        Professores professor = new Professores("Professor 1", new ArrayList<>());
        String resultadoEsperado = "Professor 1";
        String resultadoRetornado = professor.getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetNome() {
        Professores professor = new Professores();
        professor.setNome("Professor 2");
        String resultadoEsperado = "Professor 2";
        String resultadoRetornado = professor.getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetQtdDisciplinas() {
        List<Disciplinas> disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplinas("Matemática"));
        disciplinas.add(new Disciplinas("História"));
        Professores professor = new Professores("Professor 3", disciplinas);
        Integer resultadoEsperado = 2;
        Integer resultadoRetornado = professor.getDisciplinas().size();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetDisciplinas1() {
        List<Disciplinas> disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplinas("Matemática"));
        disciplinas.add(new Disciplinas("História"));
        Professores professor = new Professores("Professor 3", disciplinas);
        String resultadoEsperado = "Matemática";
        String resultadoRetornado = professor.getDisciplinas().get(0).getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetDisciplinas2() {
        List<Disciplinas> disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplinas("Matemática"));
        disciplinas.add(new Disciplinas("História"));
        Professores professor = new Professores("Professor 3", disciplinas);
        String resultadoEsperado = "História";
        String resultadoRetornado = professor.getDisciplinas().get(1).getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetDisciplinas1() {
        List<Disciplinas> disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplinas("Física"));

        Professores professor = new Professores();
        professor.setDisciplinas(disciplinas);

        String resultadoEsperado = "Física";
        String resultadoRetornado = professor.getDisciplinas().get(0).getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
        assertEquals(1, professor.getDisciplinas().size());
        assertEquals("Física", professor.getDisciplinas().get(0).getNome());
    }

    @Test
    public void testSetDisciplinas2() {
        List<Disciplinas> disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplinas("Física"));

        Professores professor = new Professores();
        professor.setDisciplinas(disciplinas);

        Integer resultadoEsperado = 1;
        Integer resultadoRetornado = professor.getDisciplinas().size();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }
}
