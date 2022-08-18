package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageStrategyTest {

    StrategyInf strategy = new AverageStrategy();

    @Test
    void apply() {
        assertEquals("0.0", strategy.result());
        strategy.apply(1);
        assertEquals("1.0", strategy.result());
        strategy.apply(2);
        assertEquals("1.5", strategy.result());
        strategy.apply(3);
        assertEquals("2.0", strategy.result());
    }
}