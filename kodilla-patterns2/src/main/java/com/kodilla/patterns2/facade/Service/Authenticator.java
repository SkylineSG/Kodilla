package com.kodilla.patterns2.facade.Service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Authenticator {

    public boolean isAuthenticator(Long userId) {
        Random random = new Random();
        return random.nextBoolean();
    }

}
