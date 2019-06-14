package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(){

        Calculator calculator2 = new Calculator();
        int sub = calculator2.substract(3,4);
        int adding = calculator2.add(3,5);

        if (sub == -1 ){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (adding == 10 ){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}