package com.kodilla.patterns2;

import com.kodilla.patterns2.librarya.Book;
import com.kodilla.patterns2.librarya.Classifier;
import com.kodilla.patterns2.libraryb.BookSignature;
import com.kodilla.patterns2.libraryb.Bookb;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet){

        Map<BookSignature, Bookb> bookFormB = new HashMap<>();

        for (Book book: bookSet){
            bookFormB.put(  (new BookSignature(book.getSignature())),
                    (new Bookb(book.getAuthor(), book.getTitle(), book.getPublicationYear())));

        }

        return medianPublicationYear(bookFormB);
    }

}