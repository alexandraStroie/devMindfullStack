package com.devminds.tema;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Masina implements IAutomobil{

    private final MotorTypeService motorTypeService;

    @Autowired
    public Masina(MotorTypeService motorTypeService){
        this.motorTypeService = motorTypeService;
    }

    @Override
    public String travel() {
        return "Travel to Spain with car";
    }

    @Override
    public String maxDrivingSpeed() {
        return "max speed is : 300";
    }

}
