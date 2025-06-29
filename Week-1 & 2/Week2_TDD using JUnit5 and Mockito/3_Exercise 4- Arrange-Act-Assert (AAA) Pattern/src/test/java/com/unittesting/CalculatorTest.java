package com.unittesting;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator created");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator destroyed");
    }

    @Test
    public void testAdd() {
        int a = 10, b = 5;

        int result = calculator.add(a, b);

        assertEquals(15, result);
    }

    @Test
    public void testMultiply() {
        // Arrange
        int a = 4, b = 6;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(24, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        // Arrange
        int a = 10, b = 0;

        calculator.divide(a, b);

    }
}
