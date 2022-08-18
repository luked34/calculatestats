package org.example;

public class AverageStrategy implements StrategyInf {

    int counter = 0;

    double total= 0D;
    @Override
    public void apply(int item) {
        counter++;
        total+=item;
    }

    @Override
    public String result() {
        return Double.toString(total > 0 ? (total / counter) : 0D);
    }
}
