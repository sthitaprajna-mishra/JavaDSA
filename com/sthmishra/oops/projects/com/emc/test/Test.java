package com.sthmishra.oops.projects.com.emc.test;

import com.sthmishra.oops.projects.com.emc.entities.Event;
import com.sthmishra.oops.projects.com.emc.entities.Organizer;

public class Test {
    public static void main(String[] args) {
        Organizer organizer = new Organizer();
        organizer.id = 123L;
        organizer.name = "Apple Inc";
        System.out.println(organizer);
        System.out.println(organizer.name);

        Event event = new Event(456L, "IPhone 100 launch", "Grand Launch");
//        event.id = 456L;
//        event.name = "IPhone 100 launch";
//        event.description = "Grand Launch";

        System.out.println(event.description);
    }
}
