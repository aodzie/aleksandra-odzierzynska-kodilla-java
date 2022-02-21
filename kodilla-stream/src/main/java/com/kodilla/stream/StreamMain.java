package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

        public static void main(String[] args) {
            BookDirectory theBookDirectory = new BookDirectory();
            String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                    .filter(book -> book.getYearOfPublication() > 2005)
                    .map(Book::toString)
                    .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

            System.out.println(theResultStringOfBooks);
        System.out.println("");

        Forum theForum = new Forum();
        Map<Integer, Object> theResultStringOfForum = theForum.getList().stream()
                .filter(forumUser -> forumUser.getGender()=='M')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.of(2002, 1, 26)))
                .filter(forumUser -> forumUser.getNumberOfPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getId,  forumUser-> forumUser));
                //.collect(Collectors.joining( "\n", "", " "));
        System.out.println(theResultStringOfForum);
    }
}