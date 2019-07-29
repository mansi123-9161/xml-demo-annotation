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
    public Actor actorBean(){

      Actor actor=new Actor();
      return actor;
    }
    @Bean//if you wish to give your name
    public Movie movieBean(){
       Movie movie=new Movie(actorBean());
       movie.setActor(actorBean());
        return movie;
    }
}
