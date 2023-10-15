package org.example;

import org.example.escola.Disciplinas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DisciplinasTest {

    private Disciplinas disciplinas;

    @BeforeEach
    public void criarObjetoDisciplinas() { disciplinas = new Disciplinas();  }

    @Test
    public void testDisciplinas() {
        disciplinas.setNome("Matemática");
        String resultadoEsperado = "Matemática";
        String resultadoRetornado = disciplinas.getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }


    @Test
    public void testSetNome() {
        Disciplinas disciplinas = new Disciplinas("História");
        String resultadoEsperado = "História";
        String resultadoRetornado = disciplinas.getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }
}
