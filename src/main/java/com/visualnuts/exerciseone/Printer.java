package com.visualnuts.exerciseone;

import com.visualnuts.exerciseone.strategy.*;

import java.util.ArrayList;
import java.util.List;

public class Printer {

    private int maxValue;
    private List<MessageStrategy> strategies;

    public Printer() {
        this.maxValue = 100;
        this.setStrategyList();
    }

    private void setStrategyList() {
        strategies = new ArrayList<>();
        strategies.add(new DividedByFifteenMessageStrategy());
        strategies.add(new DividedByFiveMessageStrategy());
        strategies.add(new DividedByThreeMessageStrategy());
        strategies.add(new NumberMessageStrategy());
    }

    public void print() {
        for (int number = 1; number <= maxValue; number++) {
            System.out.println(processMessage(number));
        }
    }

    private String processMessage(int number) {
        return strategies.stream()
                .filter(messageStrategy -> messageStrategy.accept(number))
                .findFirst()
                .get()
                .message();
    }

}
