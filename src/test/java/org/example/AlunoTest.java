package org.example;

import org.example.escola.Aluno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    public void criarObjetoAluno() {
        aluno = new Aluno();
    }

    @Test
    public void testNome() {
        aluno.setNome("Paulo");
        String resultadoEsperado = "Paulo";
        String resultadoRetornado = aluno.getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testDataDeNascimento() {
        aluno.setDataDeNascimento("01/01/2000");
        String resultadoEsperado = "01/01/2000";
        String resultadoRetornado = aluno.getDataDeNascimento();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testMatricula() {
        aluno.setMatricula(1234);
        Integer resultadoEsperado = 1234;
        int resultadoRetornado = aluno.getMatricula();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    void testConstrutorComParametros1() {
        String nome = "João";
        String dataDeNascimento = "2000-01-01";
        Integer matricula = 12345;
        Aluno aluno = new Aluno(nome, dataDeNascimento, matricula);
        String resultadoEsperado = "João";
        String resultadoRetornado = aluno.getNome();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    void testConstrutorComParametros2() {
        String nome = "João";
        String dataDeNascimento = "2000-01-01";
        Integer matricula = 12345;
        Aluno aluno = new Aluno(nome, dataDeNascimento, matricula);
        String resultadoEsperado = "2000-01-01";
        String resultadoRetornado = aluno.getDataDeNascimento();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    void testConstrutorComParametros3() {
        String nome = "João";
        String dataDeNascimento = "2000-01-01";
        Integer matricula = 12345;
        Aluno aluno = new Aluno(nome, dataDeNascimento, matricula);
        Integer resultadoEsperado = 12345;
        Integer resultadoRetornado = aluno.getMatricula();
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

}
