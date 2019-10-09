package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {


    @Bean
    public Movie moviebean() {
        Movie movieBean = new Movie(act());

        return movieBean;
    }
    @Bean
    public Actor act() {
        Actor act = new Actor();
        act.setName("Robert Downey Jr");
        act.setAge(52);
        act.setGender("male");

        return act;
    }

}