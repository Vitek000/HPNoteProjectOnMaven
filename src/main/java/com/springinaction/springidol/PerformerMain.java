package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vitek on 25.05.2015.
 */
public class PerformerMain
{
    public static void main(String[] args) throws PerformanceException
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-idol.xml");

        Performer performer = (Performer) applicationContext.getBean("kenny");
        performer.perform();

        System.out.println("=====");

        ((Performer)applicationContext.getBean("harry")).perform();


    }
}
