package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumList = new ArrayList <>();

    public Forum (){
        forumList.add (new ForumUser(1, "name1", 'M', LocalDate.of(2008,02,03), 3));
        forumList.add (new ForumUser(2, "name2", 'F', LocalDate.of(1999,10,01), 8));
        forumList.add (new ForumUser(3, "name3", 'F', LocalDate.of(2015,07,05), 1));
        forumList.add (new ForumUser(4, "name4", 'F', LocalDate.of(1967,03,24), 8));
        forumList.add (new ForumUser(5, "name5", 'M', LocalDate.of(1992,01,13), 3));
        forumList.add (new ForumUser(6, "name6", 'M', LocalDate.of(1985,12,8), 1));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(forumList);
    }
}