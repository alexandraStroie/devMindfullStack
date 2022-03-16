package com.devminds.tema;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Garaj garaj = context.getBean("garaj", Garaj.class);

        garaj.countAutomobiles();
        garaj.checkMotor();

        Masina bmw = context.getBean("masina", Masina.class);
        bmw.getMotorTypeService().setHp(1000);
        System.out.println("bmw hp:" + bmw.getMotorTypeService().getHp());
    }
}
