package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService{

    @Override
    public void information(User user, Product product) {
        System.out.println("You bought " + product);
    }

}
