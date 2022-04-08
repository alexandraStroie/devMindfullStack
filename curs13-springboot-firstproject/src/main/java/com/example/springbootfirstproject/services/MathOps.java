package com.example.springbootfirstproject.services;

import lombok.Getter;

@Getter
public class MathOps {
    private int firstNumber;
    private int secondNumber;
    private String operation;

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int mathOperations(int firstNumber, int secondNumber, String mathOp) {
        switch (mathOp) {
            case "sum":
                return firstNumber + secondNumber;
            case "difference":
                return firstNumber - secondNumber;
            case "multiply":
                return firstNumber * secondNumber;
            case "divide":
                return firstNumber / secondNumber;
            case "power":
                return (int)Math.pow(firstNumber,secondNumber);
            default:
                return 0;
        }
    }
}
