package com.shahbaz.blog.springApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
      Triangle triangle=(Triangle) applicationContext.getBean("triangle");
      triangle.draw();
    }
}
