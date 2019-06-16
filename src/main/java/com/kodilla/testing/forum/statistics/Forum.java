package com.kodilla.testing.forum.statistics;

import java.util.List;

public class Forum implements Statistics {

    int comments;
    int posts;
    String users;

    public List<String> usersNames(String users) {
       return users ;
    }


    public int postsCount() {
        return posts;
    }


    public int commentsCount(int comments) {
        return comments;
    }

    public double averagePosts(String user,int posts){
        return " "+ user + posts;
    }
    public double averageComments(int comments){
        return 0;
    }
    public double averageComOnPost(int comments,int posts){
        return 0;
    }

    public double calculateAdvStatistics(Statistics statistics){
        return 0;
    }

}
