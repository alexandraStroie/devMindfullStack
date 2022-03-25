package com.devmind;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApp {
    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        IAnimal pet1 = context.getBean("myPet1", IAnimal.class);
//        IAnimal pet2 = context.getBean("myPet2", IAnimal.class);
//        IAnimal pet3 = context.getBean("myPet3", IAnimal.class);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        IAnimal pet1 = context.getBean("cat", IAnimal.class);

        System.out.println(pet1.makeSound());
//        System.out.println(pet2.makeSound());
//        System.out.println(pet3.makeSound());

        System.out.println(pet1.animalName());

        context.close();
    }

}
