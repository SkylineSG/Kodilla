package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

   private ArrayList<Integer> selected = new ArrayList<>();

    public  ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                selected.add(number);
            }
        }
        return selected;
    }
}
