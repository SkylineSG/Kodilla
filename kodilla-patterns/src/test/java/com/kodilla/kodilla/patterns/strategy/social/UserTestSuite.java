package com.kodilla.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User pawel = new Millenials("Paweł");
        User adam = new ZGeneration("Adam");
        User tom = new YGeneration("Tom");

        //When
        String sharingFb = pawel.sharePost();
        String sharingSp = adam.sharePost();
        String sharingTw = tom.sharePost();

        //then

        Assert.assertEquals("Sharing from Facebook",sharingFb);
        Assert.assertEquals("Sharing from Twitter",sharingTw);
        Assert.assertEquals("Sharing from Snapchat",sharingSp);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User jack = new Millenials("Jack");

        //When
        String indSharing = jack.sharePost();

        //Then
        Assert.assertNotEquals("Sharing from Twitter",indSharing);

    }
}
