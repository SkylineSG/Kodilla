package com.kodilla.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void ShopingTaskTest() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        shoping.executeTask();
        //Then

        Assert.assertEquals("Shoping", shoping.getTaskName());
        Assert.assertEquals(true, shoping.isTaskExecuted());

    }

    @Test
    public void PaintingTaskTest(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        painting.executeTask();

        //Then
        Assert.assertEquals("Painting",painting.getTaskName());
        Assert.assertEquals(true,painting.isTaskExecuted());



    }
    @Test
    public void DrivingTaskTest(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        driving.executeTask();

        //Then
        Assert.assertEquals("Driving",driving.getTaskName());
        Assert.assertEquals(true,driving.isTaskExecuted());
    }
}
