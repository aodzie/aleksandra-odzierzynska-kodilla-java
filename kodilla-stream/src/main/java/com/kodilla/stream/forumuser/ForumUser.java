package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String name;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(int id, String name, char gender, LocalDate dateOfBirth, int numberOfPosts) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "Forum User: " +"id: " +id +" name: " + name + " gender: " + gender
                + " date of birth: " + dateOfBirth + " number of posts: " + numberOfPosts;
    }
}
