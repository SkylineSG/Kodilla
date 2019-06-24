package com.kodilla.stream.forum.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {



    @Test
    public void testGetPeopleQuantity(){
        //Given
         List<Country> europe = new ArrayList<>();
         Country poland = new Country("Poland",new BigDecimal("3765467"));
         europe.add(poland);
        List<Continent>  continents = new ArrayList<>();
        continents.add(new Continent("Europe",europe));
        World world = new World("world1",continents);

        //When

        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then

        Assert.assertEquals(new BigDecimal(3765467),totalPopulation);
    }
}
