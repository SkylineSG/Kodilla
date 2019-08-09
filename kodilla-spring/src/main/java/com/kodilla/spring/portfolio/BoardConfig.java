package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    Board board;

    @Bean(name = "toDoList")
    public TaskList getToDoTaskList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList getinProgressTaskList() {
        return new TaskList();
    }

    @Bean(name = "DoneList")
    public TaskList getDoneTaskList() {
        return new TaskList();
    }

    @Bean
    public Board getBoard() {
        return new Board(getToDoTaskList(), getinProgressTaskList(), getDoneTaskList());
    }
}


