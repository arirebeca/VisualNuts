package com.visualnuts.exerciseone.strategy;

import static com.visualnuts.exerciseone.Math.divisibleByFifteen;

public class DividedByFifteenMessageStrategy extends MessageStrategy {
    @Override
    public boolean accept(int number) {
        return divisibleByFifteen(number);
    }

    @Override
    public String message() {
        return "Visual Nuts";
    }
}
