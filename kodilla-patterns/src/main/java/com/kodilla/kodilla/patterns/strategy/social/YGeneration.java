package com.kodilla.kodilla.patterns.strategy.social;

import com.kodilla.kodilla.patterns.strategy.media.TwitterPublisher;

public class YGeneration extends User{

    public YGeneration(String name){
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
