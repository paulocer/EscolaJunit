package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void main_shouldPrintHelloWorld() {
        // Redefine a saída padrão para capturar a impressão no console
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Chama o método main
        Main.main(new String[0]);

        // Captura a saída impressa
        String printedOutput = outputStream.toString().trim();

        // Verifica se a saída é "Hello world!"
        assertEquals("Hello world!", printedOutput);
    }
}