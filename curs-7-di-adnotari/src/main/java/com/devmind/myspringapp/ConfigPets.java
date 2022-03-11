package com.devmind.myspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
public class ConfigPets {

    @Autowired
    AnimalName animalName;

    @Bean
    public Cat myPet1() {
        Cat cat = new Cat(animalName);
        return cat;
    }

    @Bean
    public Dog myPet2() {
        Dog dog = new Dog(animalName);
        return dog;
    }

    @Bean
    public Mouse myPet3(){
        Mouse mouse = new Mouse(animalName);
        return mouse;
    }
}
