package com.kodilla.exception.test;

public class ExceptionHandling extends SecondChallenge {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2.2, 3.3);
            System.out.println(secondChallenge);

        } catch (Exception e) {
            System.out.println("Error" + e);
        }finally {
            System.out.println("End of task");
        }

    }
}
