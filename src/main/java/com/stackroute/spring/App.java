package com.stackroute.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.out;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(config.class);
        Movie movie1=annotationConfigApplicationContext.getBean("movieBean1",Movie.class);
//        Movie movie2=annotationConfigApplicationContext.getBean("movieBean2",Movie.class);
        out.println(movie1);
//        out.println(movie2);
//        out.println(movie1==movie2);

    }
}
