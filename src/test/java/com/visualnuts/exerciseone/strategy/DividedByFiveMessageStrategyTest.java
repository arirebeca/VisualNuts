package com.visualnuts.exerciseone.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividedByFiveMessageStrategyTest {

    DividedByFiveMessageStrategy messageStrategy;

    @BeforeEach
    void setUp() {
        messageStrategy = new DividedByFiveMessageStrategy();
    }

    @Test
    void givenNumberThree_WhenAccept_ThenFalse() {
        assertFalse(messageStrategy.accept(3));
    }

    @Test
    void givenNumberFive_WhenAccept_ThenTrue() {
        assertTrue(messageStrategy.accept(5));
    }

    @Test
    void givenNumberTen_WhenAccept_ThenTrue() {
        assertTrue(messageStrategy.accept(10));
    }

    @Test
    void whenMessage_ThenNuts() {
        assertEquals("Nuts", messageStrategy.message());
    }
}