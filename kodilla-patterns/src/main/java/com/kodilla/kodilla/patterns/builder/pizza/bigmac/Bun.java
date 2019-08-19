package com.kodilla.kodilla.patterns.builder.pizza.bigmac;

public class Bun {
    public static final String SESAME = "SESAME BUN";
    public static final String PLAIN = "PLAIN BUN";
    private final String bun;

    public Bun(String bun) {
        if (bun.equals(PLAIN) || bun.equals(SESAME)) {
            this.bun = bun;
        } else {
            throw new IllegalStateException("Please select one of the following: Plain Bun, Sesame Bun");
        }
    }

    public String getBun() {
        return bun;
    }

    @Override
    public String toString() {
        return bun;
    }
}