package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("to do task");
        board.getInProgressList().addTask("in progress task");
        board.getDoneList().addTask("done task");

        String toDo = board.getToDoList().getTasks().get(0);
        String inProgress = board.getInProgressList().getTasks().get(0);
        String done = board.getDoneList().getTasks().get(0);
        //Then

        Assert.assertEquals("to do task", toDo);
        Assert.assertEquals("in progress task", inProgress);
        Assert.assertEquals("done task", done);    }
}
