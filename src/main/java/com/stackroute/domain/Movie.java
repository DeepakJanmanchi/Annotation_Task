package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Movie {
    private Actor act;

    public Movie(Actor act) {
        this.act = act;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actorName=" + act.getName() +"\t"+"actorAge=" + act.getAge() +"\t"+ "actorGender=" + act.getGender() +
                '}';
    }
}
