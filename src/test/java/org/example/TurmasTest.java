package org.example;

import org.example.escola.Turmas;
import org.example.escola.Disciplinas;
import org.example.escola.Aluno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurmasTest {

    private Turmas turma;

    @BeforeEach
    public void criarObjetoTurmas() { turma = new Turmas();  }

    @Test
    public void testGetNome() {
        List<Aluno> alunos = new ArrayList<>();
        List<Disciplinas> disciplinas = new ArrayList<>();
        Turmas turma = new Turmas("Turma A", "Sala 101", "08:00", 2023, alunos, disciplinas);
        String resultadoEsperado = "Turma A";
        String resultadoRetornado = turma.getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetSala() {
        List<Aluno> alunos = new ArrayList<>();
        List<Disciplinas> disciplinas = new ArrayList<>();
        Turmas turma = new Turmas("Turma A", "Sala 101", "08:00", 2023, alunos, disciplinas);
        String resultadoEsperado = "Sala 101";
        String resultadoRetornado = turma.getSala();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetHorario() {
        List<Aluno> alunos = new ArrayList<>();
        List<Disciplinas> disciplinas = new ArrayList<>();
        Turmas turma = new Turmas("Turma A", "Sala 101", "08:00", 2023, alunos, disciplinas);
        String resultadoEsperado = "08:00";
        String resultadoRetornado = turma.getHorario();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetAno() {
        List<Aluno> alunos = new ArrayList<>();
        List<Disciplinas> disciplinas = new ArrayList<>();
        Turmas turma = new Turmas("Turma A", "Sala 101", "08:00", 2023, alunos, disciplinas);
        Integer resultadoEsperado = 2023;
        Integer resultadoRetornado = turma.getAno();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        List<Disciplinas> disciplinas = new ArrayList<>();
        Turmas turma = new Turmas("Turma A", "Sala 101", "08:00", 2023, alunos, disciplinas);
        List<Aluno> resultadoEsperado =  alunos;
        List<Aluno> resultadoRetornado = turma.getAlunos();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetDisciplinas() {
        List<Aluno> alunos = new ArrayList<>();
        List<Disciplinas> disciplinas = new ArrayList<>();
        Turmas turma = new Turmas("Turma A", "Sala 101", "08:00", 2023, alunos, disciplinas);
        List<Disciplinas> resultadoEsperado =  disciplinas;
        List<Disciplinas> resultadoRetornado = turma.getDisciplinas();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetNome() {
        turma.setNome("Nova Turma");
        String resultadoEsperado = "Nova Turma";
        String resultadoRetornado = turma.getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetSala() {
        turma.setSala("Sala 101");
        String resultadoEsperado = "Sala 101";
        String resultadoRetornado = turma.getSala();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetHorario() {
        turma.setHorario("08:00");
        String resultadoEsperado = "08:00";
        String resultadoRetornado = turma.getHorario();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetAno() {
        turma.setAno(2022);
        Integer resultadoEsperado = 2022;
        Integer resultadoRetornado = turma.getAno();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetAlunos1() {
        Aluno aluno1 = new Aluno("João", "01/01/2000", 123);
        Aluno aluno2 = new Aluno("Maria", "02/02/2001", 124);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);

        turma.setAlunos(alunos);

        Integer resultadoEsperado =  2;
        Integer resultadoRetornado = turma.getAlunos().size();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetAlunos2() {
        Aluno aluno1 = new Aluno("João", "01/01/2000", 123);
        Aluno aluno2 = new Aluno("Maria", "02/02/2001", 124);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);

        turma.setAlunos(alunos);

        String resultadoEsperado =  "João";
        String resultadoRetornado = turma.getAlunos().get(0).getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetAlunos3() {
        Aluno aluno1 = new Aluno("João", "01/01/2000", 123);
        Aluno aluno2 = new Aluno("Maria", "02/02/2001", 124);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);

        turma.setAlunos(alunos);

        String resultadoEsperado =  "Maria";
        String resultadoRetornado = turma.getAlunos().get(1).getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetAlunos4() {
        Aluno aluno1 = new Aluno("João", "01/01/2000", 123);
        Aluno aluno2 = new Aluno("Maria", "02/02/2001", 124);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);

        turma.setAlunos(alunos);

        List<Aluno> resultadoEsperado =  alunos;
        List<Aluno> resultadoRetornado = turma.getAlunos();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetDisciplinas1() {
        Disciplinas disciplina1 = new Disciplinas("Matemática");
        Disciplinas disciplina2 = new Disciplinas("Português");
        Disciplinas disciplina3 = new Disciplinas("Física");
        Disciplinas disciplina4 = new Disciplinas("Química");

        List<Disciplinas> disciplinas = new ArrayList<>();
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);
        disciplinas.add(disciplina4);

        turma.setDisciplinas(disciplinas);

        Integer resultadoEsperado =  4;
        Integer resultadoRetornado = turma.getDisciplinas().size();
        assertEquals (resultadoEsperado, resultadoRetornado);
        assertEquals(disciplinas, turma.getDisciplinas());
    }

    @Test
    public void testSetDisciplinas2() {
        Disciplinas disciplina1 = new Disciplinas("Matemática");
        Disciplinas disciplina2 = new Disciplinas("Português");
        Disciplinas disciplina3 = new Disciplinas("Física");
        Disciplinas disciplina4 = new Disciplinas("Química");

        List<Disciplinas> disciplinas = new ArrayList<>();
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);
        disciplinas.add(disciplina4);

        turma.setDisciplinas(disciplinas);

        String resultadoEsperado =  "Português";
        String resultadoRetornado = turma.getDisciplinas().get(1).getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
        assertEquals(disciplinas, turma.getDisciplinas());
    }

    @Test
    public void testSetDisciplinas3() {
        Disciplinas disciplina1 = new Disciplinas("Matemática");
        Disciplinas disciplina2 = new Disciplinas("Português");
        Disciplinas disciplina3 = new Disciplinas("Física");
        Disciplinas disciplina4 = new Disciplinas("Química");

        List<Disciplinas> disciplinas = new ArrayList<>();
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);
        disciplinas.add(disciplina4);

        turma.setDisciplinas(disciplinas);

        String resultadoEsperado =  "Química";
        String resultadoRetornado = turma.getDisciplinas().get(3).getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
        assertEquals(disciplinas, turma.getDisciplinas());
    }

    @Test
    public void testSetDisciplinas4() {
        Disciplinas disciplina1 = new Disciplinas("Matemática");
        Disciplinas disciplina2 = new Disciplinas("Português");

        List<Disciplinas> disciplinas = new ArrayList<>();
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);

        turma.setDisciplinas(disciplinas);

        List<Disciplinas> resultadoEsperado =  disciplinas;
        List<Disciplinas> resultadoRetornado = turma.getDisciplinas();
        assertEquals (resultadoEsperado, resultadoRetornado);
        assertEquals(disciplinas, turma.getDisciplinas());
    }

}
