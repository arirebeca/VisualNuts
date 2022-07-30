package com.visualnuts.exerciseone.strategy;

import static com.visualnuts.exerciseone.Math.divisibleByThree;

public class DividedByThreeMessageStrategy extends MessageStrategy {
    @Override
    public boolean accept(int number) {
        return divisibleByThree(number);
    }

    @Override
    public String message() {
        return "Visual";
    }
}
