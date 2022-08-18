package org.example;

public class MaximumStrategy implements StrategyInf {

    private Integer value = null;

    @Override
    public void apply(int item) {
        if (value == null || value<item) value = item;
    }

    @Override
    public String result() {
        return value == null ? null : Integer.toString(value);
    }
}
