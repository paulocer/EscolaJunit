package org.example;

import org.example.escola.Boletim;
import org.example.escola.Notas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoletimTest {

    private Boletim boletim;

    @BeforeEach
    public void criarObjetoBoletim() { boletim = new Boletim();  }

    @Test
    void setAluno() {
        boletim.setAluno("João");
        String resultadoEsperado = "João";
        String resultadoRetornado = boletim.getAluno();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    void getNota1() {
        List<Notas> notas = new ArrayList<>();
        notas.add(new Notas("Ana", "Matemática", 1, 1, 9.0f));
        notas.add(new Notas("Ana", "Matemática", 1, 2, 6.0f));
        notas.add(new Notas("Ana", "Matemática", 1, 3, 0.0f));
        boletim.setNota(notas);

        Integer resultadoEsperado = 3;
        Integer resultadoRetornado = boletim.getNota().size();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    void getNota2() {
        List<Notas> notas = new ArrayList<>();
        notas.add(new Notas("Ana", "Matemática", 1, 1, 9.0f));
        notas.add(new Notas("Ana", "Matemática", 1, 2, 6.0f));
        notas.add(new Notas("Ana", "Matemática", 1, 3, 0.0f));
        boletim.setNota(notas);

        Float resultadoEsperado = 6.0f;
        Float resultadoRetornado = boletim.getNota().get(1).getNota();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    void getNota3() {
        List<Notas> notas = new ArrayList<>();
        notas.add(new Notas("Ana", "Matemática", 1, 1, 9.0f));
        notas.add(new Notas("Ana", "Matemática", 1, 2, 6.0f));
        notas.add(new Notas("Ana", "Matemática", 1, 3, 0.0f));
        boletim.setNota(notas);

        Float resultadoEsperado = 0.0f;
        Float resultadoRetornado = boletim.getNota().get(2).getNota();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    void getMedia() {
        boletim.setMedia(8.5f);
        Float resultadoEsperado = 8.5f;
        Float resultadoRetornado = boletim.getMedia();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    void setMedia() {
        List<Notas> notas = new ArrayList<>();
        notas.add(new Notas("Ana", "Matemática", 1, 1, 9.0f));
        notas.add(new Notas("Ana", "Matemática", 1, 2, 6.0f));
        notas.add(new Notas("Ana", "Matemática", 1, 3, 0.0f));
        boletim.setNota(notas);
        boletim.setMedia(boletim.calcularMediaAritmetica());
        Float resultadoEsperado = 5.0f;
        Float resultadoRetornado = boletim.getMedia();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    void construtor_QuandoChamado_DeveAtribuirValoresCorretos1() {
        String aluno = "João";
        List<Notas> notas = new ArrayList<>();
        notas.add(new Notas(aluno,"Matemática", 1, 1, 10.0f));
        Float media = 10.0f;

        Boletim boletim = new Boletim(aluno, notas, media);

        String resultadoEsperado = "João";
        String resultadoRetornado = boletim.getAluno();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    void calcularMediaAritmetica_QuandoNotasNula_DeveRetornarZero() {
        boletim.setNota(null);

        float media = boletim.calcularMediaAritmetica();

        Float resultadoEsperado = 0.0f;
        Float resultadoRetornado = media;
        assertEquals (resultadoEsperado, resultadoRetornado, 0.01f);
    }

    @Test
    void calcularMediaAritmetica_QuandoNotasVazia_DeveRetornarZero1() {
        boletim.setNota(new ArrayList<>());

        float media = boletim.calcularMediaAritmetica();

        Float resultadoEsperado = 0.0f;
        Float resultadoRetornado = media;
        assertEquals (resultadoEsperado, resultadoRetornado, 0.01f);
    }

    @Test
    void calcularMediaAritmetica_QuandoNotasValidas_DeveRetornarMediaCorreta() {
        List<Notas> notas = new ArrayList<>();
        notas.add(new Notas("José", "Matemática", 1, 1, 10.0f));
        notas.add(new Notas("José", "Matemática", 1, 2, 8.0f));

        Boletim boletim = new Boletim();
        boletim.setNota(notas);

        float media = boletim.calcularMediaAritmetica();

        Float resultadoEsperado = 9.0f;
        Float resultadoRetornado = media;
        assertEquals (resultadoEsperado, resultadoRetornado, 0.01f);
    }

    @Test
    void calcularMediaAritmetica_QuandoNotasValidas_DeveCalcularCorretamente() {
        List<Notas> notas = new ArrayList<>();
        notas.add(new Notas("Aluno1", "Disciplina1", 1, 1, 7.5f));
        notas.add(new Notas("Aluno1", "Disciplina1", 1, 2, 8.0f));
        notas.add(new Notas("Aluno1", "Disciplina1", 1, 3, 9.0f));
        boletim.setNota(notas);

        float mediaEsperada = (7.5f + 8.0f + 9.0f) / 3;
        float mediaCalculada = boletim.calcularMediaAritmetica();

        assertEquals(mediaEsperada, mediaCalculada, 0.01f);
    }

    @Test
    void calcularMediaAritmetica_QuandoUmaNotaZerada_DeveCalcularCorretamente() {
        List<Notas> notas = new ArrayList<>();
        notas.add(new Notas("Aluno1", "Disciplina1", 1, 1, 7.5f));
        notas.add(new Notas("Aluno1", "Disciplina1", 1, 2, 0.0f));
        notas.add(new Notas("Aluno1", "Disciplina1", 1, 3, 9.0f));
        boletim.setNota(notas);

        float mediaEsperada = (7.5f + 0.0f + 9.0f) / 3;
        float mediaCalculada = boletim.calcularMediaAritmetica();

        assertEquals(mediaEsperada, mediaCalculada, 0.01f);
    }

    @Test
    void calcularMediaAritmetica_QuandoNaoHouverNotas_DeveRetornarZero() {
        boletim.setNota(null);

        float media = boletim.calcularMediaAritmetica();

        assertEquals(0.0f, media, 0.01f);
    }
}
