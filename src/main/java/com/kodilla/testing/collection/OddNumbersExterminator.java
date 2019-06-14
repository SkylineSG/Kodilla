package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> numbers = new ArrayList<>();

    ArrayList<Integer> selected = new ArrayList<>();

    public  ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        for(int c=0;c < numbers.size();c++){
            if (numbers.get(c) % 2 == 0){
                selected.add(numbers.get(c));
            }
        }return selected;
    }
}
