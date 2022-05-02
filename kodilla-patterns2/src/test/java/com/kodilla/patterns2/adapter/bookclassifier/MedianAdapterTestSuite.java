package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest(){
        Set<Book> books = new HashSet<>();

        books.add(new Book("Author1", "Title1", 2022, "A1"));
        books.add(new Book("Author2", "Title2", 2020, "A2"));
        books.add(new Book("Author3", "Title3", 2000, "A3"));

        MedianAdapter medianAdapter = new MedianAdapter();

        int median = medianAdapter.publicationYearMedian(books);

        assertEquals(2020, median);

    }
}
