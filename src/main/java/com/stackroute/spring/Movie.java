package com.stackroute.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
   // @Autowired
    Actor actor;

    public Movie() {
    }

    //@Autowired
    public Movie(Actor actor) {
        this.actor=actor;
    }

    public Actor getActor() {
        return actor;
    }
    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
