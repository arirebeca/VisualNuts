package com.visualnuts.exerciseone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PrinterTest {

    private ByteArrayOutputStream outputStream;
    String[] lines;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        new Printer().print();
        lines = outputStream.toString().split(System.lineSeparator());
    }

    @Test
    void givenNumberOne_WhenPrint_ThenNumberOneMessage() {
        assertEquals("1", lines[0]);
    }

    @Test
    void givenDivisibleByThree_WhenPrint_ThenVisualMessage() {
        assertEquals("Visual", lines[2]);
    }

    @Test
    void givenDivisibleByFive_WhenPrint_ThenNutsMessage() {
        assertEquals("Nuts", lines[4]);
    }

    @Test
    void givenDivisibleByFifteen_WhenPrint_ThenVisualNutsMessage() {
        assertEquals("Visual Nuts", lines[14]);
    }

    @Test
    void givenNumberTwentyNine_WhenPrint_ThenNumberTwentyNineMessage() {
        assertEquals("29", lines[28]);
    }

    @Test
    void givenNumberHundred_WhenPrint_ThenNutsMessage() {
        assertEquals("Nuts", lines[99]);
    }

    @Test
    void givenNumberHundredAndOne_WhenPrint_ThenThrowsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            lines[100].equals("101");
        });
    }
}