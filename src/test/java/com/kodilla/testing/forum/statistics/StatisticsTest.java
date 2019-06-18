//package com.kodilla.testing.forum.statistics;
//
//import com.sun.org.glassfish.external.statistics.Statistic;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.LinkedList;
//
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class StatisticsTest {
//    @Test
//    public void calculateAdvStatistics(Statistic statistic) {
//
//        //Given
//        Statistics statisticsMock = mock(Statistics.class);
//        LinkedList<Integer> commentsList = new LinkedList<>();
//        commentsList.add(1);
//        commentsList.add(1);
//        commentsList.add(1);
//        commentsList.add(1);
//        commentsList.add(1);
//
//        when(statisticsMock.getComments()).thenReturn(commentsList);
//
//        //When
//        int quantityOfComments = comments.calculateComments();
//
//        //Then
//        Assert.assertEquals(5, quantityOfComments);
//    }
//}