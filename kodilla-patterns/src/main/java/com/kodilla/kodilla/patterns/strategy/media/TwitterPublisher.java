package com.kodilla.kodilla.patterns.strategy.media;

import com.kodilla.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Sharing from Twitter";
    }
}
