package com.visualnuts.exerciseone.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividedByFifteenMessageStrategyTest {

    DividedByFifteenMessageStrategy messageStrategy;

    @BeforeEach
    void setUp() {
        messageStrategy = new DividedByFifteenMessageStrategy();
    }

    @Test
    void givenNumberThree_WhenAccept_ThenFalse() {
        assertFalse(messageStrategy.accept(3));
    }

    @Test
    void givenNumberFive_WhenAccept_ThenFalse() {
        assertFalse(messageStrategy.accept(5));
    }

    @Test
    void givenNumberFifteen_WhenAccept_ThenTrue() {
        assertTrue(messageStrategy.accept(15));
    }

    @Test
    void givenNumberThirty_WhenAccept_ThenTrue() {
        assertTrue(messageStrategy.accept(30));
    }

    @Test
    void whenMessage_ThenNuts() {
        assertEquals("Visual Nuts", messageStrategy.message());
    }
}