package com.devmind.myspringapp;

import lombok.Data;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Data
@Setter
@Component("animalName")
public class AnimalName {

    private String name = "my name is Oscar";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
