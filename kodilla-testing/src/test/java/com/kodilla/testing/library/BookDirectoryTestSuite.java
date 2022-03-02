package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith({MockitoExtension.class})
class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;

    BookDirectoryTestSuite() {
    }

    @Test
    void testListBooksWithConditionsReturnList() {
        BookLibrary bookLibrary = new BookLibrary(this.libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        Mockito.when(this.libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        Assertions.assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList();

        for(int n = 1; n <= booksQuantity; ++n) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }

        return resultList;
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        BookLibrary bookLibrary = new BookLibrary(this.libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList();
        List<Book> resultListOf15Books = this.generateListOfNBooks(15);
        List<Book> resultListOf40Books = this.generateListOfNBooks(40);
        Mockito.when(this.libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        Mockito.when(this.libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
        Mockito.when(this.libraryDatabaseMock.listBooksWithCondition("Any title")).thenReturn(resultListOf15Books);
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        Assertions.assertEquals(0, theListOfBooks0.size());
        Assertions.assertEquals(15, theListOfBooks15.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        LibraryDatabase libraryDatabaseMock = (LibraryDatabase)Mockito.mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        Assertions.assertEquals(0, theListOfBooks10.size());
        ((LibraryDatabase)Mockito.verify(libraryDatabaseMock, Mockito.times(0))).listBooksWithCondition(ArgumentMatchers.anyString());
    }

    @Test
    void testListBooksInHandsOf() {
        BookLibrary bookLibrary = new BookLibrary(this.libraryDatabaseMock);
        LibraryUser libraryUser0 = new LibraryUser("name", "lastname", "1111111");
        LibraryUser libraryUser1 = new LibraryUser("name2", "lastname2", "2222222");
        LibraryUser libraryUser5 = new LibraryUser("name3", "lastname3", "3333333");
        List<Book> resultListOf0Books = new ArrayList();
        List<Book> resultListOf1Book = this.generateListOfNBooks(1);
        List<Book> resultListOf5Books = this.generateListOfNBooks(5);
        Mockito.when(this.libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(resultListOf1Book);
        Mockito.when(this.libraryDatabaseMock.listBooksInHandsOf(libraryUser0)).thenReturn(resultListOf0Books);
        Mockito.when(this.libraryDatabaseMock.listBooksInHandsOf(libraryUser5)).thenReturn(resultListOf5Books);
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(libraryUser0);
        List<Book> theListOfBooks1 = bookLibrary.listBooksInHandsOf(libraryUser1);
        List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(libraryUser5);
        Assertions.assertEquals(0, theListOfBooks0.size());
        Assertions.assertEquals(1, theListOfBooks1.size());
        Assertions.assertEquals(5, theListOfBooks5.size());
    }
}