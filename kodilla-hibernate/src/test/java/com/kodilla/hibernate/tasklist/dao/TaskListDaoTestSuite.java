package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("ToDoList","List of TO DO Items");
        taskListDao.save(taskList);
        String taskListName = taskList.getListName();

        //When
        List<TaskList> findByName= taskListDao.findByListName(taskListName);
        String name = findByName.get(0).getListName();

        //Then
        Assert.assertEquals("ToDoList", name);

        //Cleanup
        int id = findByName.get(0).getId();
        taskListDao.delete(id);

    }
}