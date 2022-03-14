package com.devminds.tema;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartMotorMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Garaj garaj = context.getBean("garaj", Garaj.class);

        garaj.countAutomobiles();
        garaj.checkMotor();
    }
}
