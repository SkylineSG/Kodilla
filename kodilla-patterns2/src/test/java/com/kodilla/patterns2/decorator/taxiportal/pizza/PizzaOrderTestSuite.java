package com.kodilla.patterns2.decorator.taxiportal.pizza;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost(){
        //Given
        Pizza thePizza = new BasicPizza();

        //When
        BigDecimal pizzaCost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal(10), pizzaCost);
    }

    @Test
    public void testBasicPizzaGetDescription(){
        //Given
        Pizza thePizza = new BasicPizza();

        //When
        String pizzaDescription = thePizza.getDescription();

        //Then
        assertEquals("Pizza with : ", pizzaDescription);
    }

    @Test
    public void testBasicPizzaIngGetCost(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new GarlicSauceDecorator(thePizza);

        //When
        BigDecimal pizzaCost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal(12), pizzaCost);
    }

    @Test
    public void testBasicPizzaGetIngDescription(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new GarlicSauceDecorator(thePizza);

        //When
        String pizzaDescription = thePizza.getDescription();

        //Then
        assertEquals("Pizza with :  Garlic", pizzaDescription);
    }

    @Test
    public void testBasicPizzaIng2GetCost(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new GarlicSauceDecorator(thePizza);
        thePizza = new HamDecorator(thePizza);

        //When
        BigDecimal pizzaCost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal(14), pizzaCost);
    }

    @Test
    public void testBasicPizzaGetIng2Description(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new GarlicSauceDecorator(thePizza);
        thePizza = new HamDecorator(thePizza);

        //When
        String pizzaDescription = thePizza.getDescription();

        //Then
        assertEquals("Pizza with :  Garlic Ham", pizzaDescription);
    }
}
