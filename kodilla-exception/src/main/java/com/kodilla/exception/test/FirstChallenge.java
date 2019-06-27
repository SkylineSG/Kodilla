package com.kodilla.exception.test;

import java.util.stream.Stream;

public class FirstChallenge {
    public double divide(double a, double b)
        /* throws ArithmeticException */{
   /*     if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
        */
        double resoult = 0;

        try {
            resoult = (int)a / (int)b;
        }catch (ArithmeticException e){
            System.out.println("Do not devide by 0");
        }finally {
            System.out.println("Value a: "+ a+ "  "+"Value b: "+b);
        }
        return resoult;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }

}