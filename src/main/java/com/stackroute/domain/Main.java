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

        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean beanLifecycleDemoBean = (BeanLifecycleDemoBean) configurableApplicationContext.getBean("BeanLifeCycleDemoBean");
        BeanPostProcessorDemoBean beanPostProcessorDemoBean=(BeanPostProcessorDemoBean) configurableApplicationContext.getBean("BeanPostProcessorDemoBean") ;
        System.out.println(beanPostProcessorDemoBean);
        System.out.println(beanLifecycleDemoBean);
        configurableApplicationContext.close();
    }
}
