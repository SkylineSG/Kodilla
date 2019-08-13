package com.kodilla.kodilla.patterns.singleton;

public class Logger {
    private String lastLog = "";
    private static Logger LoggerInstance = null;



    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public static Logger getInstance() {
        if (LoggerInstance == null) {
            synchronized(Logger.class) {
                if (LoggerInstance == null) {
                    LoggerInstance = new Logger();
                }
            }
        }
        return LoggerInstance;
    }
    public String getLastLog(){
        return lastLog;
    }
}