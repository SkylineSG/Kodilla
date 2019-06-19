package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();

        beautifier.beautify("DEF",c -> "ABC" + c);
        beautifier.beautify("To",c -> c +"ruń");
        beautifier.beautify("Las Vegas", c -> c.toUpperCase());
        beautifier.beautify("UNITED KINGDOM",c -> c.toLowerCase() );
        beautifier.beautify("Poland",c -> c + ": 2019");
    }
}