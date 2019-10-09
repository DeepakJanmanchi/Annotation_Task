package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Movie {

    private Actor actor;

    public Movie(Actor act) {
        this.actor = act;
    }



    public void displayMovieInfo(){
        System.out.println("Actor name is:" + actor.getName());
    }

}
