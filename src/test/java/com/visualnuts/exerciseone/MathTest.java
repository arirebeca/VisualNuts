package com.visualnuts.exerciseone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MathTest {

    @Test
    void givenDividendFive_WhenDivisibleByThree_ThenFalse() {
        assertFalse(Math.divisibleByThree(5));
    }

    @Test
    void givenDividendThree_WhenDivisibleByThree_ThenTrue() {
        assertTrue(Math.divisibleByThree(3));
    }

    @Test
    void givenDividendFifteen_WhenDivisibleByThree_ThenTrue() {
        assertTrue(Math.divisibleByThree(15));
    }

    @Test
    void givenDividendFive_WhenDivisibleByFive_ThenTrue() {
        assertTrue(Math.divisibleByFive(5));
    }

    @Test
    void givenDividendThree_WhenDivisibleByFive_ThenFalse() {
        assertFalse(Math.divisibleByFive(3));
    }

    @Test
    void givenDividendFifteen_WhenDivisibleByFive_ThenTrue() {
        assertTrue(Math.divisibleByFive(15));
    }

    @Test
    void givenDividendFifteen_WhenDivisibleByFifteen_ThenTrue() {
        assertTrue(Math.divisibleByFifteen(15));
    }

    @Test
    void givenDividendThirty_WhenDivisibleByFifteen_ThenTrue() {
        assertTrue(Math.divisibleByFifteen(30));
    }

    @Test
    void givenDividendForty_WhenDivisibleByFifteen_ThenFalse() {
        assertFalse(Math.divisibleByFifteen(40));
    }
}