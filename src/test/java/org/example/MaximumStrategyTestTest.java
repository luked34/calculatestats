package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumStrategyTestTest {

    StrategyInf strategy = new MaximumStrategy();

    @Test
    void testResult() {
        assertEquals(null, strategy.result());
    }

    @Test
    void testApply() {
        strategy.apply(1);
        assertEquals("1", strategy.result());
    }

    @Test
    void testApplyTwice() {
        strategy.apply(1);
        strategy.apply(2);
        assertEquals("2", strategy.result());
    }
}