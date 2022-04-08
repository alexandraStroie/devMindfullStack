package com.devmind.springinit.service;

import com.devmind.springinit.domain.MathRequest;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Long compute(MathRequest mathRequest) {
        return switch (mathRequest.getOperation()) {
            case sum -> mathRequest.getFirstNumber() + mathRequest.getSecondNumber();
            case difference -> mathRequest.getFirstNumber() - mathRequest.getSecondNumber();
            case multiply -> mathRequest.getFirstNumber() * mathRequest.getSecondNumber();
            case divide -> mathRequest.getFirstNumber() / mathRequest.getSecondNumber();
            case power -> (long) Math.pow(mathRequest.getFirstNumber(), mathRequest.getSecondNumber());
        };
    }
}
