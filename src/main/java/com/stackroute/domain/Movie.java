package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

public class Movie
{
    private Actor actor;

    public Movie()
    {
    }

    public Movie(Actor actor)
    {
        this.actor = actor;
    }

    public Actor getActor()
    {
        return actor;
    }

    public void setActor(Actor actor)
    {
        this.actor = actor;
    }

    @Override
    public String toString()
    {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
