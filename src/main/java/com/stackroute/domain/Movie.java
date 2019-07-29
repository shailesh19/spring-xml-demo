package com.stackroute.domain;

public class Movie
{
    private String author;

    public Movie()
    {
    }

    public Movie(String author)
    {
        this.author = author;
    }

    @Override
    public String toString()
    {
        return "Movie{" +
                "author='" + author + '\'' +
                '}';
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
}
