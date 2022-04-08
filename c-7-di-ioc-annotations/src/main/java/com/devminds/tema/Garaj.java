package com.devminds.tema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Garaj {

    // DI field
    @Autowired
    private Autocar autocar;

    //DI setter
    private Motocicleta motocicleta;

    //DI constructor
    private Masina masina;

    private List<IAutomobil> carList;

    public Garaj(Masina masina) {
        this.masina = masina;
        this.carList = new ArrayList<>();
    }


    @Autowired
    public void setMotocicleta(Motocicleta motocicleta) {
        this.motocicleta = motocicleta;
    }

    public void countAutomobiles() {
        addCar();
        carList.forEach(carType -> System.out.printf("%s at %s%n",
                carType.travel(),
                carType.maxDrivingSpeed()
        ));
    }

    private void addCar(){
        carList.add(autocar);
        carList.add(masina);
        carList.add(motocicleta);
    }

    public void checkMotor() {
        System.out.println(this.motocicleta.getMotorTypeService().getType());
        System.out.println(this.autocar.getMotorTypeService().getType());
    }
}
