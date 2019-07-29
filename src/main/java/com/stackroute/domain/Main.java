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

        Actor actor = context.getBean("actor",Actor.class);
        System.out.println(actor);

        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Actor actor1 = xmlBeanFactory.getBean("actor",Actor.class);
        System.out.println(actor1);

        Actor actor2 = xmlBeanFactory.getBean("actor2",Actor.class);
        System.out.println(actor2);

        Actor actor3 = context.getBean("actor3",Actor.class);
        System.out.println(actor3);

    }
}
