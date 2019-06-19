//package com.kodilla.testing.forum.statistics;
//
//import java.util.List;
//
//public class Forum implements Statistics {
//
//    int users;
//    int posts;
//    int comments;
//    double avPostsPerUser;
//    double avCommentsPerUser;
//    double avCommentsPerPost;
//
//    public void calculateAdvStatistics(Statistics statistics) {
//        users = statistics.usersNames().size();
//
//        posts= statistics.postsCount();
//
//        comments = statistics.commentsCount();
//
//    if (statistics.usersNames().size() == 0) {
//        avPostsPerUser = 0.0;
//    } else {
//        avPostsPerUser = (double)statistics.postsCount() / (double)statistics.usersNames().size();
//    }
//
//        if (statistics.usersNames().size() == 0) {
//        avCommentsPerUser = 0.0;
//    } else {
//        avCommentsPerUser = (double)statistics.commentsCount() / (double)statistics.usersNames().size();
//    }
//
//        if (statistics.postsCount() == 0) {
//        avCommentsPerPost = 0.0;
//    } else {
//        avCommentsPerPost = (double)statistics.commentsCount() / (double)statistics.postsCount();
//    }
//
//    }
//
//    @Override
//    public List<String> usersNames(int users) {
//        return users;
//    }
//
//    @Override
//    public int postsCount(int posts) {
//        return posts;
//    }
//
//    @Override
//    public int commentsCount( int comments) {
//        return comments;
//    }
//}
