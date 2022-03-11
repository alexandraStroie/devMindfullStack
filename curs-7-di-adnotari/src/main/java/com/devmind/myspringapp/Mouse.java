package com.devmind.myspringapp;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("mouse")
public class Mouse implements IAnimal {

    private AnimalName animalName;

    public Mouse(AnimalName animalName) {
        this.animalName = animalName;
    }

    @Override
    public String makeSound() {
        return "hi, i'm jerry seinfeld";
    }

    @Override
    public String animalName() {
        return null;
    }
}
