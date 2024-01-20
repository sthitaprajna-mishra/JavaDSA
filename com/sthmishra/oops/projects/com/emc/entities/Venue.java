package com.sthmishra.oops.projects.com.emc.entities;

public class Venue extends EMBase {
    public String description;
    public String streetAddress;
    public String city;
    public String state;
    public String pinCode;

    public Venue() {
        System.out.println(super.name);
    }
}
