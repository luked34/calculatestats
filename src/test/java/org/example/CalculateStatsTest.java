package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateStatsTest {


    @Test
    void getHelloWorld() {
        assertEquals("Hello, Wojciech!", new CalculateStats().getHelloWorld());
    }
}