package com.kodilla.good.patterns;


import com.kodilla.good.patterns.MovieStore;

import java.util.stream.Collectors;

public class MoviePrinter {
    public static void main(String[] args){

        MovieStore movies = new MovieStore();

        String moviesToDisplay = movies.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("  !  "));

        System.out.println("Movies:");
        System.out.println(moviesToDisplay);



    }
}
