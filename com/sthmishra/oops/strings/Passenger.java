package com.sthmishra.oops.strings;

public class Passenger {
    private int id;
    private String firstName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }

    @Override
    public int hashCode() {
        return this.getId();
    }

    @Override
    public boolean equals(Object obj) {
        Passenger newPassenger = (Passenger)obj;
        return newPassenger.getId() == this.getId() && newPassenger.getFirstName() == this.getFirstName() && newPassenger.getLastName() == this.getLastName();
    }
}
