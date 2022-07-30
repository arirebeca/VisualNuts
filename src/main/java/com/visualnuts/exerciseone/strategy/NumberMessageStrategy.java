package com.visualnuts.exerciseone.strategy;

public class NumberMessageStrategy extends MessageStrategy {
    private int number;

    public boolean accept(int number) {
        this.number = number;
        return true;
    }

    public String message() {
        return Integer.toString(number);
    }
}
