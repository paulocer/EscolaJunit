package org.example;

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
        Notas nota = new Notas("João", "Matemática", 1, 1, 9.5f);
        String resultadoEsperado = "João";
        String resultadoRetornado = nota.getAluno();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetDisciplina() {
        Notas nota = new Notas("Maria", "Português", 2, 2, 8.0f);
        String resultadoEsperado = "Português";
        String resultadoRetornado = nota.getDisciplina();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetAvaliacao() {
        Notas nota = new Notas("Pedro", "História", 1, 3, 7.2f);
        Integer resultadoEsperado = 3;
        Integer resultadoRetornado = nota.getAvaliacao();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetUnidade() {
        Notas nota = new Notas("Mariana", "Geografia", 2, 1, 9.0f);
        Integer resultadoEsperado = 2;
        Integer resultadoRetornado = nota.getUnidade();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testGetNota() {
        Notas nota = new Notas("Carlos", "Inglês", 3, 2, 8.7f);
        Float resultadoEsperado = 8.7f;
        Float resultadoRetornado = nota.getNota();
        assertEquals (resultadoEsperado, resultadoRetornado, 0.001);
    }

    @Test
    public void testSetAluno() {
        nota.setAluno("Paulo");
        String resultadoEsperado = "Paulo";
        String resultadoRetornado = nota.getAluno();
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