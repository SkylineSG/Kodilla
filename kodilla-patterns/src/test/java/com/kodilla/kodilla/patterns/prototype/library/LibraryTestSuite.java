package com.kodilla.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Book first = new Book("tom", "Thomas", LocalDate.of(1722, 5, 12));
        Book second = new Book("New adventure", " Poal John", LocalDate.of(1978, 2, 9));
        Book third = new Book("Harry", "Wol dem", LocalDate.of(2019, 3, 30));
        Book fourth = new Book("Avocado", "Pawel", LocalDate.of(2009, 1, 23));

        Library library = new Library("Biblioteka 1");
        library.getBooks().add(first);
        library.getBooks().add(second);
        library.getBooks().add(third);
        library.getBooks().add(fourth);

        //making shallow copy
        Library library2 = null;
        try {
            library2 = library.shallowCopy();
            library2.setName("Bilbioteka 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making deep copy
        Library library3 = null;
        try {
            library3 = library.deepCopy();
            library3.setName("Biblioteka 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(third);
        //Then
        library.getBooks().stream()
                .forEach(System.out::println);
        System.out.println();

        library2.getBooks().stream()
                .forEach(System.out::println);
        System.out.println();

        library3.getBooks().stream()
                .forEach(System.out::println);

        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, library2.getBooks().size());
        Assert.assertEquals(4, library3.getBooks().size());


    }
}