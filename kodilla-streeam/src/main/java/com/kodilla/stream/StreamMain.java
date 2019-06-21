package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();

        beautifier.beautify("DEF",c -> "ABC" + c);
        beautifier.beautify("To",c -> c +"ruń");
        beautifier.beautify("Las Vegas", c -> c.toUpperCase());
        beautifier.beautify("UNITED KINGDOM",c -> c.toLowerCase() );
        beautifier.beautify("Poland",c -> c + ": 2019");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


        System.out.println();
        System.out.println();
        System.out.println();
 // 7.3

        Forum forum = new Forum();

        Map<Integer,ForumUser> theResultListOfForumUser = forum.getList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> user.getDate().getYear() <= 1999 )
                .filter(user -> user.getPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getID, user -> user));



        theResultListOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
    }

