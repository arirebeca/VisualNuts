package com.visualnuts.exerciseone.strategy;

public abstract class MessageStrategy {

    public abstract boolean accept(int number);

    public abstract String message();

}
