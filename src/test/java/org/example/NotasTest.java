package org.example;

import org.example.escola.Aluno;
import org.example.escola.Notas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotasTest {
    private Notas nota;

    @BeforeEach
    public void criarObjetoNotas() { nota = new Notas();  }

    @Test
    public void testGetAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        nota.setAluno(aluno);

        String resultadoEsperado = "João";
        Aluno nomeRetornado = nota.getAluno();

        String resultadoRetornado = nomeRetornado.getNome();
        assertEquals(resultadoEsperado, resultadoRetornado);
    }
    @Test
    public void testGetDisciplina() {
        Aluno aluno = new Aluno();
        aluno.setNome("Maria");
        Notas nota = new Notas(aluno, "Português", 2, 2, 8.0f);
        String resultadoEsperado = "Português";
        String resultadoRetornado = nota.getDisciplina();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetAvaliacao() {
        Aluno aluno = new Aluno();
        aluno.setNome("Robson");
        Notas nota = new Notas(aluno, "História", 1, 3, 7.2f);
        Integer resultadoEsperado = 3;
        Integer resultadoRetornado = nota.getAvaliacao();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetUnidade() {
        Aluno aluno = new Aluno();
        aluno.setNome("Paulo");
        Notas nota = new Notas(aluno, "Geografia", 2, 1, 9.0f);
        Integer resultadoEsperado = 2;
        Integer resultadoRetornado = nota.getUnidade();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetNota() {
        Aluno aluno = new Aluno();
        aluno.setNome("Carlos");
        Notas nota = new Notas(aluno, "Inglês", 3, 2, 8.7f);
        Float resultadoEsperado = 8.7f;
        Float resultadoRetornado = nota.getNota();
        assertEquals (resultadoEsperado, resultadoRetornado, 0.001);
    }


    @Test
    public void testSetAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome("Paulo");
        nota.setAluno(aluno);
        String resultadoEsperado = "Paulo";
        Aluno resultadoEncontrado = nota.getAluno();
        String resultadoRetornado = resultadoEncontrado.getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetDisciplina() {
        nota.setDisciplina("Química");
        String resultadoEsperado = "Química";
        String resultadoRetornado = nota.getDisciplina();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetAvaliacao() {
        nota.setAvaliacao(2);
        Integer resultadoEsperado = 2;
        Integer resultadoRetornado = nota.getAvaliacao();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetUnidade() {
        nota.setUnidade(3);
        Integer resultadoEsperado = 3;
        Integer resultadoRetornado = nota.getUnidade();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSetNota() {
        nota.setNota(8.0f);
        Float resultadoEsperado = 8.0f;
        Float resultadoRetornado = nota.getNota();
        assertEquals (resultadoEsperado, resultadoRetornado, 0.001);
    }

}