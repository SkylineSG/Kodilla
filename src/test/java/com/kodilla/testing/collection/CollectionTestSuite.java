package com.kodilla.testing.collection;

import com.kodilla.testing.collection.CollectionTestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test : start");
    }

    @After
    public void after(){
        System.out.println("Test : end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator numb = new OddNumbersExterminator();

        ArrayList<Integer> result = numb.exterminate(numb.selected);
        System.out.println("Testing " + result);

        Assert.assertEquals(numb.selected.size() == 0,result);

    }

    public  void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator numb = new OddNumbersExterminator();

        ArrayList<Integer> result = numb.exterminate(numb.selected);
        System.out.println("Testing " + result);

        Assert.assertEquals(numb.selected.size(),result);
    }
}
