package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {


    static void getAverage(int[] numbers){
        IntStream.range(0,numbers.length)
                .map(System.out::println);
        IntStream.range(0,numbers.length)
                .average();
    }
}
