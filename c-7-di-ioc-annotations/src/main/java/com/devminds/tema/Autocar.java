package com.devminds.tema;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Autocar implements IAutomobil{

    @Autowired
    private MotorTypeService motorTypeService;

    @Override
    public String travel() {
        return "Travel to Italy with autocar";
    }

    @Override
    public String maxDrivingSpeed() {
        return "max driving speed 150km/h";
    }
}
