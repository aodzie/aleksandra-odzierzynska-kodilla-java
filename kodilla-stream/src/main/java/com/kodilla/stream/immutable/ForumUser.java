package com.kodilla.stream.immutable;

import org.w3c.dom.ls.LSOutput;

public final class ForumUser {
    private final String name;
    private final String lastname;
    private final String email;

    public ForumUser(String name, String lastname, String email) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }
}
