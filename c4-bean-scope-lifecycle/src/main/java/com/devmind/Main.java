package com.devmind;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Task task1 = context.getBean("myPrototypeTask", Task.class);
        Task task2 = context.getBean("myPrototypeTask", Task.class);

        task1.run();
        task2.run();

        context.close();
    }
}
