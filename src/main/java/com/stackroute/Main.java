package com.stackroute;

import com.stackroute.DataConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);
        Movie movie = context.getBean("moviebean", Movie.class);
        System.out.println(movie.toString());

    }
}