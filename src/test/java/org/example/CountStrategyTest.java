package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountStrategyTest {

    StrategyInf strategy = new CountStrategy();

    @Test
    void apply() {
        assertEquals("0", strategy.result());
        strategy.apply(0);
        assertEquals("1", strategy.result());
        strategy.apply(0);
        assertEquals("2", strategy.result());
        strategy.apply(0);strategy.apply(0);strategy.apply(0);
        assertEquals("5", strategy.result());
    }

    @Test
    void result() {
    }
}