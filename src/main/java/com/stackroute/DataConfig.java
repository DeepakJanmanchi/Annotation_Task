package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute")
public class DataConfig {


    @Bean (name ="actor1")
    public Actor act() {
        Actor act = new Actor();
        act.setName("Robert Downey Jr");
        act.setAge(52);
        act.setGender("male");

        return act;
    }

}