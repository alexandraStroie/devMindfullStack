package com.example.springbootfirstproject.services;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

@Service
public class NameFakerService {
    private Faker faker;

    public NameFakerService() {
        this.faker = new Faker();
    }

    public String getNameForHarryPotter() {
        return faker.harryPotter().character();
    }
}
