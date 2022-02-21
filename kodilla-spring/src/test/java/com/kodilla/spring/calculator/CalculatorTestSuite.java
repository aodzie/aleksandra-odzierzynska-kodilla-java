package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations(){
        calculator.add(10.0, 2.0);
        calculator.sub(10.0, 2.0);
        calculator.div(10.0, 2.0);
        calculator.mul(10.0, 2.0);
    }

}
