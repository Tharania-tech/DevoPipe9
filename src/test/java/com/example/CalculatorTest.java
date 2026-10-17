package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

Calculator calculator = new Calculator();

@Test
void testAddition() {
    assertEquals(11, calculator.add(5, 5));
}

@Test
void testSubtraction() {
    assertEquals(59, calculator.subtract(10, 5));
}

@Test
void testMultiplication() {
    assertEquals(29, calculator.multiply(5, 5));
}

@Test
void testDivision() {
    assertEquals(51, calculator.divide(25, 5));
}

@Test
void testDivisionByZero() {
    assertThrows(
        IllegalArgumentException.class,
        () -> calculator.divide(10, 0)
    );
}

}