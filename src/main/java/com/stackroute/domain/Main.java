package com.stackroute.domain;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Movie movie = (Movie) context.getBean("movie");
        System.out.println(movie);

        Movie movie1 = (Movie) context.getBean("movie2");
        System.out.println(movie1);

    }
}
