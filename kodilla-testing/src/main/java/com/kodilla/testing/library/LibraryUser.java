package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    private String firstname;
    private String lastname;
    private String peselId;

    public LibraryUser(String firstname, String lastname, String peselId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselId = peselId;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPeselId() {
        return this.peselId;
    }

    public void setPeselId(String peselId) {
        this.peselId = peselId;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            LibraryUser that = (LibraryUser)o;
            return Objects.equals(this.firstname, that.firstname) && Objects.equals(this.lastname, that.lastname) && Objects.equals(this.peselId, that.peselId);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.firstname, this.lastname, this.peselId});
    }
}