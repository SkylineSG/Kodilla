package com.kodilla.kodilla.patterns.strategy.media;

import com.kodilla.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Sharing from Snapchat";
    }
}
