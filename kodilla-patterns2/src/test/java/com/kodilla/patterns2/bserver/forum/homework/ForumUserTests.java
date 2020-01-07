package com.kodilla.patterns2.bserver.forum.homework;

import com.kodilla.patterns2.observer.forum.homework.JavaTask1;
import com.kodilla.patterns2.observer.forum.homework.JavaTask2;
import com.kodilla.patterns2.observer.forum.homework.Mentor;
import com.kodilla.patterns2.observer.forum.homework.Task;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTests {

    @Test
    public void testUpdateTask() {
        //Given
        Task javaTask1 = new JavaTask1();
        Task javaTask2 = new JavaTask2();

        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar = new Mentor("Ivone Escobar");
        Mentor jessiePinkman = new Mentor("Jessie Pinkman");

        javaTask1.registerObserver(johnSmith);
        javaTask1.registerObserver(jessiePinkman);
        javaTask2.registerObserver(ivoneEscobar);
        javaTask2.registerObserver(jessiePinkman);
        //When
        javaTask1.addTask("Java update 1");
        javaTask1.addTask("Java update 2");
        javaTask1.addTask("Java update 3");
        javaTask2.addTask("Java update 1");
        javaTask2.addTask("Java update 2");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}