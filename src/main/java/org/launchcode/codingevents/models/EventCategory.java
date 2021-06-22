package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;


@Entity
public class EventCategory extends AbstractEntity {

    private String name;

    @Size(min= 3, message = "Name must be at least 3 characters long")
    public EventCategory(String name) {
        this.name = name;
    }

    public EventCategory() { };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

}
