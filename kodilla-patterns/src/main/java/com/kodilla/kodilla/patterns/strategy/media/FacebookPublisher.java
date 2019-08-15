package com.kodilla.kodilla.patterns.strategy.media;

import com.kodilla.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Sharing from Facebook";
    }
}
