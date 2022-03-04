package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ForumUser {
    String username;
    public ForumUser() {
        this.username = "John Smith";
    }

    public String getUsername() {
        return username;
    }

}
