package com.kodilla.spring.calculator;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)

@SpringBootTest
public class CalculatorTestSuite {


    @Test
    public void testCalculations() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double num1 = 22.3;
        double num2 = 44.0;

        // When
        double sumResult = calculator.add(num1, num2);
        double subResult = calculator.sub(num1, num2);
        double mulResult = calculator.mul(num1, num2);
        double divResult = calculator.div(num1, num2);

        // Then
        assertEquals(66.3, sumResult, 16);
        assertEquals(-21.7, subResult, 16);
        assertEquals(981.2, mulResult, 16);
        assertEquals(0.5068181818181818, divResult, 16);
    }
}
