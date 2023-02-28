package com.demo;

import com.demo.beans.GreatMatrimonyQuest;
import com.demo.beans.Knight;
import com.demo.beans.Person;
import com.demo.beans.RescuingDimselQuest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        context.registerShutdownHook();
//
//        Person person = context.getBean(Person.class);
//        person.setName("Thaw Thaw");
//        System.out.println("Name ==>" + person.getName());

//        Knight knight = new Knight();
//        knight.setQuest(new GreatMatrimonyQuest());
//        System.out.println(knight.goQuest());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
        Knight knight = context.getBean(Knight.class);
        System.out.println(knight.goQuest());
    }
}
