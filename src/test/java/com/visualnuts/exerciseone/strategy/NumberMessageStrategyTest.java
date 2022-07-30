package com.visualnuts.exerciseone.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberMessageStrategyTest {

    NumberMessageStrategy messageStrategy;

    @BeforeEach
    void setUp() {
        messageStrategy = new NumberMessageStrategy();
    }

    @Test
    void givenNumberOne_WhenAccept_ThenTrue() {
        assertTrue(messageStrategy.accept(1));
    }

    @Test
    void givenNumberTwo_WhenAccept_ThenTrue() {
        assertTrue(messageStrategy.accept(2));
    }

    @Test
    void givenNumberFour_WhenAccept_ThenTrue() {
        assertTrue(messageStrategy.accept(4));
    }

    @Test
    void givenNumberOne_whenMessage_ThenNuts() {
        messageStrategy.accept(1);
        assertEquals("1", messageStrategy.message());
    }

    @Test
    void givenNumberTwo_whenMessage_ThenNuts() {
        messageStrategy.accept(2);
        assertEquals("2", messageStrategy.message());
    }
}