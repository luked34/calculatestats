package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageStrategyTest {

    StrategyInf strategy = new AverageStrategy();

    @Test
    void apply() {
        assertEquals("0", strategy.result());
    }
}