package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

class LibraryTestSuite {
@Test
        void testGetBooks() {
        //given
        Library library = new Library("Library");

        library.addBook(new Book("Title1", "Author1", LocalDate.of(2020,02,18)));
        library.addBook(new Book("Title2", "Author2", LocalDate.of(1990, 10, 05)));
        library.addBook(new Book("Title1","Author3", LocalDate.of(1994, 07, 13)));

        Book book4 = new Book("book4", "author4", LocalDate.of(2000, 01, 01));
        library.addBook(book4);

        //shallowCopy()
        Library clonedLibrary = null;
        try{
                clonedLibrary = library.shallowCopy();
                clonedLibrary.setName("shallowCopy");
        } catch (CloneNotSupportedException e){
                System.out.println(e);
        }

        //deepCopy()
        Library deepClonedLibrary = null;
        try{
                deepClonedLibrary = library.deepCopy();
                deepClonedLibrary.setName("deepcopy");
        } catch (CloneNotSupportedException e){
                System.out.println(e);
        }

        //when
        library.getBooks().remove(book4);

        //then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());
}
}
