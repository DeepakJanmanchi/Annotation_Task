package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    @Autowired
    @Qualifier("actor1")
    Actor actorName;


    public void displayMovieInfo(){
        System.out.println("Actor name is:" + actorName.getName());
    }

}
