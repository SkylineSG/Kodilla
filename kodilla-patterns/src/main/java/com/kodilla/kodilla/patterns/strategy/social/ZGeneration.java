package com.kodilla.kodilla.patterns.strategy.social;

import com.kodilla.kodilla.patterns.strategy.media.SnapchatPublisher;

public class ZGeneration extends User {

    public ZGeneration(String name){
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
