package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
       // ctx.getEnvironment().setActiveProfiles("prod");
        ctx.getEnvironment().setActiveProfiles("dev");

        ctx.scan("org.example");
        ctx.refresh();
        Person person = ctx.getBean(Person.class);
        System.out.println("name:"+person.getFirstname() +", last:"+ person.getLastname() );

    }
}
