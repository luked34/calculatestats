package org.example;

public class AverageStrategy implements StrategyInf {

    int counter = 0;

    int total = 0;

    @Override
    public void apply(int item) {
        counter++;
    }

    @Override
    public String result() {
        return Integer.toString(counter);
    }
}
