
package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator {

    private static final Logger LOGGER =
            Logger.getLogger(Calculator.class.getName());

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;

        LOGGER.log(Level.INFO, "Addition: {0}", calculator.add(a, b));
        LOGGER.log(Level.INFO, "Subtraction: {0}", calculator.subtract(a, b));
        LOGGER.log(Level.INFO, "Multiplication: {0}", calculator.multiply(a, b));
        LOGGER.log(Level.INFO, "Division: {0}", calculator.divide(a, b));
    }
}
