package com.kodilla.testing.collection;

import com.kodilla.testing.collection.CollectionTestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test : start");
    }

    @After
    public void after() {
        System.out.println("Test : end");
    }

    @Test
    public void testOddNumbersExterminatorWhenIsEmptyList() {
        //Given
        OddNumbersExterminator numb = new OddNumbersExterminator();

        //When
        ArrayList<Integer> result = numb.exterminate(new ArrayList<>());
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(0, result.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator numb = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(2);

        ArrayList<Integer> expectedNumbers = new ArrayList<>();
        expectedNumbers.add(4);
        expectedNumbers.add(2);
        expectedNumbers.add(2);
        //When
        ArrayList<Integer> result = numb.exterminate(numbers);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(expectedNumbers, result);
    }
}
