package com.visualnuts.exerciseone;

public class Math {

    public static boolean divisibleByThree(int dividend) {
        return divisibleBy(dividend, 3);
    }

    public static boolean divisibleByFive(int dividend) {
        return divisibleBy(dividend, 5);
    }

    public static boolean divisibleByFifteen(int dividend) {
        return divisibleByThree(dividend) && divisibleByFive(dividend);
    }

    private static boolean divisibleBy(int dividend, int divisor) {
        return (dividend % divisor) == 0;
    }
}
