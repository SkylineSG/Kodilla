package com.kodilla.hibernate.manytomany.facade;

public class SearchingException extends Exception{

    public static String ERR_NO_COMPANY = "No companies data available.";
    public static String ERR_NO_EMPLOYEE = "No employees data available";

    public SearchingException(String message){
        super(message);
    }
}
