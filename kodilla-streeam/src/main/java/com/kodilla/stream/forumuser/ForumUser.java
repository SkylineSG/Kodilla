package com.kodilla.stream.forumuser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public final class ForumUser {

    private final int ID;
    private final String user;
    private final char gender;
    private final LocalDate birthDate;
    private final int posts;
    Calendar actual = Calendar.getInstance();


    public ForumUser(int ID, String user, char gender,int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int posts) {
        this.ID = ID;
        this.user = user;
        this.gender = gender;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.posts = posts;
    }

    public int getID() {
        return ID;
    }

    public String getUser() {
        return user;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDate() {
        return birthDate;
    }
    public int getActualYear() {
        return actual.get(Calendar.YEAR) - getDate().getYear();
   }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", user='" + user + '\'' +
                ", gender=" + gender +
                ", date=" + birthDate +
                ", posts=" + posts +
                '}';
    }
}
