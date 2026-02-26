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
        assertEquals(5, calculator.add(2, 3));
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

    @Test
    void remainder_evenNumberDivideByTwo_returnsZero() {
        assertEquals(0, calculator.remainder(42, 2));
    }

    @Test
    void remainder_oddNumberDivideByTwo_returnsOne() {
        assertEquals(1, calculator.remainder(43, 2));
    }

    @Test
    void average_arrayOfNumbers_returnsAverage() {
        int[] numbers = {2, 4, 6, 8};
        assertEquals(5, calculator.average(numbers));
    }
}
