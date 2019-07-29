package com.stackroute.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    Actor actor;

    @Autowired
    public Movie(Actor actor) {
        this.actor=actor;
    }

    public Actor getActor() {
        return actor;
    }

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
