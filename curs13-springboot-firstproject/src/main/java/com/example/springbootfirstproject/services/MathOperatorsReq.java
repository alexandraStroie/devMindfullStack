package com.example.springbootfirstproject.services;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class MathOperatorsReq {
    private int firstNr;
    private int secondNr;
    private Operation operation;

    public enum Operation {
        sum,
        diff,
        multipy,
        div,
        pow
    }

}
