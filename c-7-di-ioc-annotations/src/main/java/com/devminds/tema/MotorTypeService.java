package com.devminds.tema;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Getter
@Setter
@Component
@Scope("prototype")
public class MotorTypeService {
    private int hp;
    private int maxSpeed;
    private String type;

    private static final Random random = new Random();
    private String typesOfMotors[] = {"electric", "benzina", "motorina"};

    public MotorTypeService(){
        this.hp = random.nextInt(200);
        this.maxSpeed = random.nextInt(300);

        int r = random.nextInt(2);
        this.type = typesOfMotors[r];
    }

}
