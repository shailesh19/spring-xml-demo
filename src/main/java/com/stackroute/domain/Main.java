package com.stackroute.domain;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Movie movie = (Movie) context.getBean("movie");
        System.out.println(movie);

        ConfigurableApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean beanLifecycleDemoBean = (BeanLifecycleDemoBean) context1.getBean("BeanLifecycleDemoBean");
        System.out.println(beanLifecycleDemoBean);
        context1.close();
    }
}
