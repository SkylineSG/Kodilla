package com.kodilla.kodilla.patterns.builder.pizza.bigmac;

public class Ingredients {
    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILI_PEPPERS = "CHILI_PEPPERS";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String SHRIMP = "SHRIMP";
    public static final String CHEESE = "CHEESE";
    private final String ingredients;

    public Ingredients(String ingredients) {
        if (ingredients.equals(LETTUCE)
                || ingredients.equals(ONION)
                || ingredients.equals(BACON)
                || ingredients.equals(CUCUMBER)
                || ingredients.equals(CHILI_PEPPERS)
                || ingredients.equals(MUSHROOMS)
                || ingredients.equals(SHRIMP)
                || ingredients.equals(CHEESE)) {
            this.ingredients = ingredients;
        } else {
            throw new IllegalStateException("Please select one of the allowed ingredients");
        }
    }

    public String getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return ingredients;
    }
}
