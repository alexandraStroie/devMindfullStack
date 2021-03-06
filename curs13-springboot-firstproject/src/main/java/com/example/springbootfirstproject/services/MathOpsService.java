package com.example.springbootfirstproject.services;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class MathOpsService {
    private int firstNumber;
    private int secondNumber;
    private String operation;

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

//    public int mathOperations(int firstNumber, int secondNumber, String mathOp) {
//        switch (mathOp) {
//            case "sum":
//                return firstNumber + secondNumber;
//            case "difference":
//                return firstNumber - secondNumber;
//            case "multiply":
//                return firstNumber * secondNumber;
//            case "divide":
//                return firstNumber / secondNumber;
//            case "power":
//                return (int)Math.pow(firstNumber,secondNumber);
//            default:
//                return 0;
//        }
//    }


    public int mathOperations(MathOperatorsReq mathOp) {
        return switch (mathOp.getOperation()) {
            case sum -> mathOp.getFirstNr() + mathOp.getSecondNr();
            case diff -> mathOp.getFirstNr() - mathOp.getSecondNr();
            case multipy -> mathOp.getFirstNr() * mathOp.getSecondNr();
            case div -> mathOp.getFirstNr() / mathOp.getSecondNr();
            case pow -> (int)Math.pow(mathOp.getFirstNr(), mathOp.getSecondNr());
        };
    }
}
