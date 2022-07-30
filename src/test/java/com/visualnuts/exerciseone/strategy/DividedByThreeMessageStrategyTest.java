package com.visualnuts.exerciseone.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividedByThreeMessageStrategyTest {

    DividedByThreeMessageStrategy messageStrategy;

    @BeforeEach
    void setUp() {
        messageStrategy = new DividedByThreeMessageStrategy();
    }

    @Test
    void givenNumberThree_WhenAccept_ThenTrue() {
        assertTrue(messageStrategy.accept(3));
    }

    @Test
    void givenNumberFive_WhenAccept_ThenFalse() {
        assertFalse(messageStrategy.accept(5));
    }

    @Test
    void givenNumberSix_WhenAccept_ThenTrue() {
        assertTrue(messageStrategy.accept(6));
    }

    @Test
    void whenMessage_ThenVisual() {
        assertEquals("Visual", messageStrategy.message());
    }
}