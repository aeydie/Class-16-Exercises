package org.launchcode.codingevents.models;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class Person extends AbstractEntity {

    String age;

    public Person(String age){
        this.age = age;
    }

    public Person(){}

    @ManyToOne
    private Event event;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
