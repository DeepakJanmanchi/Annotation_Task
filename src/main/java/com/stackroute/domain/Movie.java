package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Movie {


    Actor actorName;

    public Movie(Actor actorName) {

        this.actorName = actorName;
    }

    public void displayMovieInfo(){
        System.out.println("Actor name is:" + actorName.getName());
    }

}
