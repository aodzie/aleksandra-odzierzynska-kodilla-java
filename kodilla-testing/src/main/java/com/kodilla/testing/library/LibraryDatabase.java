package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    List<Book> listBooksWithCondition(String var1);

    List<Book> listBooksInHandsOf(LibraryUser var1);

    boolean rentABook(LibraryUser var1, Book var2);

    int returnBooks(LibraryUser var1);
}
