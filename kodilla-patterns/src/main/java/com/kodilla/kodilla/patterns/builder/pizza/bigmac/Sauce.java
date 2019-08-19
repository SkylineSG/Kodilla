package com.kodilla.kodilla.patterns.builder.pizza.bigmac;

public class Sauce {
    public static final String STANDARD = "STANDARD";
    public static final String THOUSAND_ISLANDS = "THOUSAND_ISLANDS";
    public static final String BARBECUE = "BARBECUE";
    private final String sauce;

    public Sauce(String sauce) {
        if (sauce.equals(STANDARD) || sauce.equals(THOUSAND_ISLANDS) || sauce.equals(BARBECUE)) {
            this.sauce = sauce;
        } else {
            throw new IllegalStateException("Please select one of the following: Standard, Thousand Islands, Barbecue");
        }
    }

    public String getSauce() {
        return sauce;
    }

    @Override
    public String toString() {
        return sauce;
    }
}