package com.devminds.tema;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Motocicleta implements IAutomobil{

    private MotorTypeService motorTypeService;

    @Autowired
    public void setMotorTypeService(MotorTypeService motorTypeService) {
        this.motorTypeService = motorTypeService;
    }

    @Override
    public String travel() {
        return "Around the world on 2 wheels";
    }

    @Override
    public String maxDrivingSpeed() {
        return "max speed 200km/h";
    }
}
