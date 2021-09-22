package org.launchcode.codingevents.models;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import java.util.Objects;

public class Event {

    private String name;
    private String description;

    @NotBlank(message = "Location cannot be left blank!")

    @AssertTrue
    private boolean requiredAttendance;

    @Positive(message="number of attendees much be one or more!")
    private int numberOfAttendees;

    @Past(message="Date of sign up has to be in the past!")
    private String dateOfSignup;

    private String location;
    private int id;
    private static int nextId = 1;


    public Event(String name, String description) {
        this.name = name;
        this.description = description;
        this.id = nextId;
        nextId++;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name;
    }
}
