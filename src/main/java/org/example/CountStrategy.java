package org.example;

public class CountStrategy implements StrategyInf {

    int counter = 0;

    @Override
    public void apply(int item) {
        counter++;
    }

    @Override
    public String result() {
        return Integer.toString(counter);
    }
}
