package com.stackroute.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.stackroute.spring")
@PropertySource("application.properties")
public class config {
    @Bean//if you wish to give your name
    public Actor actorBean1(){

      Actor actor1=new Actor();

      return actor1;
    }
    @Bean//if you wish to give your name
    public Actor actorBean2(){

        Actor actor2=new Actor();
        return actor2;
    }
    @Bean//if you wish to give your name
    public Actor actorBean3(){

        Actor actor3=new Actor();
        return actor3;
    }

    @Bean//if you wish to give your name
    public Movie movieBean1(){
       Movie movie=new Movie(actorBean1());
       movie.setActor(actorBean1());
        return movie;
    }
    @Bean//if you wish to give your name
    public Movie movieBean2(){
        Movie movie=new Movie(actorBean2());
        movie.setActor(actorBean2());
        return movie;
    }
}
