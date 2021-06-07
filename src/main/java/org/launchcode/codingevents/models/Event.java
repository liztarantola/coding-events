package org.launchcode.codingevents.models;

import javax.validation.constraints.*;

import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;

    @Size(max = 500, message = "Description too long.")
    private String description;

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotNull(message = "Must have a location.")
    @NotBlank(message = "Not enough info. Please be more specific.")
    private String location;

    @AssertTrue(message ="All events require registration")
    private Boolean registrationRequired;

//    if (event.registrationReqired().equals(true)) {
//        return true;
//    } else {
//        return false;
//    }
    public Event(String name, String description, String contactEmail, String location, Boolean registrationRequired) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registrationRequired = true;
    }

    public Event() {
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

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;

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
}

