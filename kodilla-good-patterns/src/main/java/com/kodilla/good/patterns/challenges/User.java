package com.kodilla.good.patterns.challenges;

public class User {
    String name;
    String surname;
    public User(String name,String surname){
        this.name=name;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
