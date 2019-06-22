package com.kodilla.stream.forum.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;
        numbers[10] = 11;
        numbers[11] = 12;
        numbers[12] = 13;
        numbers[13] = 14;
        numbers[14] = 15;
        numbers[15] = 16;
        numbers[16] = 17;
        numbers[17] = 18;
        numbers[18] = 19;
        numbers[19] = 20;

        //When
        List<Integer> number = ArrayOperations.getAverage(numbers[]);


        //Then
        int numbersAverage = IntStream.range(0,number.size())
                .average();

        Assert.assertEquals(10, numbersAverage);
    }
}
