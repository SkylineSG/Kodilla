package com.kodilla.kodilla.patterns.strategy.social;

import com.kodilla.kodilla.patterns.strategy.media.FacebookPublisher;

public class Millenials extends User {

    public Millenials(String name){
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
