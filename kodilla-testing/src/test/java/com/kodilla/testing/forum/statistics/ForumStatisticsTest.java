package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTest {

    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;

    @Before
    public void forTestData(){
        statisticsMock = mock(Statistics.class);
        List<String> listForMock = new ArrayList<>();
        for (int i=0; i<10; i++){
            listForMock.add("ForumUser");
        }
        when(statisticsMock.usersNames()).thenReturn(listForMock);
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.postsCount()).thenReturn(80);
        forumStatistics = new ForumStatistics();
    }

    @Test
    public void testForPostCountZero(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getPostCount());
        Assert.assertEquals(0, forumStatistics.getPostsAvgPerUser(),0.01);
        Assert.assertEquals(0, forumStatistics.getCommentsAvgPerPost(),0.01);
    }

    @Test
    public void testForPostCountThousend(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, forumStatistics.getPostCount());
        Assert.assertEquals(100, forumStatistics.getPostsAvgPerUser(),0.01);
        Assert.assertEquals(0.04, forumStatistics.getCommentsAvgPerPost(),0.01);
    }

    @Test
    public void testForCommentsCountZero(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getCommentCount());
        Assert.assertEquals(0, forumStatistics.getCommentsAvgPerUser(),0.01);
        Assert.assertEquals(0, forumStatistics.getCommentsAvgPerPost(),0.01);
    }

    @Test
    public void testForMorePostToComments(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(5, forumStatistics.getCommentCount());
        Assert.assertEquals(10, forumStatistics.getPostCount());
        Assert.assertEquals(1, forumStatistics.getPostsAvgPerUser(), 0.01);
        Assert.assertEquals(0.5, forumStatistics.getCommentsAvgPerUser(),0.01);
        Assert.assertEquals(0.5, forumStatistics.getCommentsAvgPerPost(),0.01);
    }

    @Test
    public void testForMoreCommentsToPost(){
        //Given
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(40, forumStatistics.getCommentCount());
        Assert.assertEquals(80, forumStatistics.getPostCount());
        Assert.assertEquals(8, forumStatistics.getPostsAvgPerUser(), 0.01);
        Assert.assertEquals(4, forumStatistics.getCommentsAvgPerUser(),0.01);
        Assert.assertEquals(0.5, forumStatistics.getCommentsAvgPerPost(),0.01);
    }

    @Test
    public void testForUserzZero(){
        //Given
        List<String> listForMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listForMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getUsersInForum());
        Assert.assertEquals(0, forumStatistics.getPostsAvgPerUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getCommentsAvgPerUser(), 0.01);
    }

    @Test
    public void testForUserzHundret(){
        //Given
        List<String> listForMock = new ArrayList<>();
        for (int i=0; i<100; i++){
            listForMock.add("ForumUser");
        }
        when(statisticsMock.usersNames()).thenReturn(listForMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, forumStatistics.getUsersInForum());
        Assert.assertEquals(0.8, forumStatistics.getPostsAvgPerUser(), 0.01);
        Assert.assertEquals(0.4, forumStatistics.getCommentsAvgPerUser(), 0.01);
    }

}
