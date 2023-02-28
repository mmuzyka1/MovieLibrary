package org.example;

public abstract class MoviePerson {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
