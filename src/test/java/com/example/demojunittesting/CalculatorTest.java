package com.example.demojunittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void additionTest() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.add(1,1), "The output should be the sum of the two arguments");
    }
}
