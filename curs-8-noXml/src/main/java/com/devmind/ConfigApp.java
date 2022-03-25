package com.devmind;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
public class ConfigApp {

    @Bean
    public Dog dog() {
        return new Dog(animalName());
    }

    @Bean
    public Cat cat() {
        return new Cat(animalName());
    }

    @Bean
    public Mouse mouse() {
        return new Mouse(animalName());
    }

    @Bean
    public AnimalName animalName() {
        return new AnimalName();
    }


}
