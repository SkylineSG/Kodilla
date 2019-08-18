package com.kodilla.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING TASK";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPPING_TASK :
                return new ShoppingTask("Shoping","Milk",3.33);
            case PAINTING_TASK:
                return new PaintingTask("Painting","Blue","Ocean");
            case DRIVING_TASK:
                return new DrivingTask("Driving","Poland","Car");
            default:
                return null;

        }
    }
}
