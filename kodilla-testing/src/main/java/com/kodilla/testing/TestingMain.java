package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public TestingMain() {
    }

    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        Calculator calculator = new Calculator();
        int result1 = calculator.add(5, 5);
        int result2 = calculator.subtract(5, 5);
        System.out.println("Result of adding 5+5: " + result1);
        System.out.println("Result of subtracting 5-5: " + result2);
    }
}