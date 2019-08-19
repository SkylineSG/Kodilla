package com.kodilla.kodilla.patterns.builder.pizza.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BigMacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(new Bun("PLAIN BUN"))
                .burgers(2)
                .ingredients(new Ingredients("ONION"))
                .ingredients(new Ingredients("BACON"))
                .ingredients(new Ingredients("MUSHROOMS"))
                .ingredients(new Ingredients("SHRIMP"))
                .sauce(new Sauce("STANDARD"))
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String usedBun = bigmac.getBun().toString();
        String usedSauce = bigmac.getSauce().toString();
        //Then
        Assert.assertEquals("PLAIN BUN", usedBun);
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals("STANDARD", usedSauce);
    }
}
