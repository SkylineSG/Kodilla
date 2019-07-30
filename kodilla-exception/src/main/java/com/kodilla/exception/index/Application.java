package com.kodilla.exception.index;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.ArrayList;
class Application {

    public static void main(String[] args){

        ArrayDeque<String> deque = new ArrayDeque<>();

        Random generator = new Random();

        for(int i=0;i<50;i++){
            String tekst = "";


            int result = generator.nextInt(50) + 1;
            for(int j = 0; j < result; j++){
                tekst += "a";
            }
            deque.add(tekst);

        }
        Application deq = new Application();
        deq.separate(deque);


    }
    public void separate(ArrayDeque<String> separ){
        ArrayList<String> even = new ArrayList<String>();
        ArrayList<String> odd = new ArrayList<String>();

        for(String tmp: separ){
            if (separ.size() % 2 == 0){
                even.add(tmp);
            } else {
                odd.add(tmp);
            }
        }
    }


}

