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
        System.out.println("\n"+"using Application context"+"\n");
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(DataConfig.class);
        System.out.println("\n Aware Interface Values \n");
        Movie movie= (Movie) applicationContext.getBean("moviebean",Movie.class);
        movie.displayMovieInfo();

    }
}