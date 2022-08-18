package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {

    final List<Integer> list = List.of(6, 9, 15, -2, 92, 11);



    @Test
    void testMin() {
        CalculateStats stats = new CalculateStats();
        StrategyInf strategy = new MinimumStrategy();
        stats.result(list, strategy);
        assertEquals("-2", strategy.result());
    }

    @Test
    void testMax() {
        CalculateStats stats = new CalculateStats();
        StrategyInf strategy = new MaximumStrategy();
        stats.result(list, strategy);
        assertEquals("92", strategy.result());
    }

    @Test
    void testCount() {
        CalculateStats stats = new CalculateStats();
        StrategyInf strategy = new CountStrategy();
        stats.result(list, strategy);
        assertEquals("6", strategy.result());
    }

    @Test
    void testAverage() {
        CalculateStats stats = new CalculateStats();
        StrategyInf strategy = new AverageStrategy();
        stats.result(list, strategy);
        assertEquals("21.833333333333332", strategy.result());
    }
}
