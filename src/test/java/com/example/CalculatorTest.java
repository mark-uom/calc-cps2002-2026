package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add_twoPositiveNumbers_returnsSum() {
        assertEquals(4, calculator.add(2, 3));
    }

    @Test
    void add_twoNegativeNumbers_returnsSum() {
        assertEquals(-7, calculator.add(-3, -4));
    }

    @Test
    void add_positiveAndNegativeNumber_returnsSum() {
        assertEquals(1, calculator.add(5, -4));
    }

    @Test
    void add_withZero_returnsOtherNumber() {
        assertEquals(42, calculator.add(42, 0));
    }

    @Test
    void add_bothZero_returnsZero() {
        assertEquals(0, calculator.add(0, 0));
    }
}
