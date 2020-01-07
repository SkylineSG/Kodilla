package com.kodilla.patterns2;

import com.kodilla.patterns2.libraryb.BookSignature;
import com.kodilla.patterns2.libraryb.BookStatistics;
import com.kodilla.patterns2.libraryb.Bookb;
import com.kodilla.patterns2.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    @Override
    public int averagePublicationYear(Map<BookSignature, Bookb> books){
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Bookb> books){
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}