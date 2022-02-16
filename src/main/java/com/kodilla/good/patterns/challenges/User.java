package com.kodilla.good.patterns.challenges;

public class User {
    private String userName;
    private String userLastName;

    public User(String userName, String userLastName) {
        this.userName = userName;
        this.userLastName = userLastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserLastName() {
        return userLastName;
    }
}
