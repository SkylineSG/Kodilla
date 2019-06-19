package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String c, PoemDecorator poemDecorator){
        String result =  poemDecorator.decorate(c);
        System.out.println("Result equals: " + result);

    }
}
