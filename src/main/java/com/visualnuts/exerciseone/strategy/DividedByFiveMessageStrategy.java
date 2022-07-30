package com.visualnuts.exerciseone.strategy;

import static com.visualnuts.exerciseone.Math.divisibleByFive;

public class DividedByFiveMessageStrategy extends MessageStrategy {
    @Override
    public boolean accept(int number) {
        return divisibleByFive(number);
    }

    @Override
    public String message() {
        return "Nuts";
    }
}
