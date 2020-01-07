package com.kodilla.patterns2.observer.forum.homework;

public class Mentor implements Observer {

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Task task){
        System.out.println(mentorName + ": New Task" + task.getName() + "\n" + "(total:  "+ task.getMessages().size() + " messages)" );
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
