package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateStatsTest {

    StrategyInf strategy = new MinimumStrategy();

    @Test
    void getHelloWorld() {
        assertEquals("Hello, Wojciech!", new CalculateStats().getHelloWorld());
    }

    @Test
    void testResult() {
        assertEquals(null, strategy.result());
    }

    @Test
    void testApply() {
        strategy.apply(1);
        assertEquals("1", strategy.result());
    }
}