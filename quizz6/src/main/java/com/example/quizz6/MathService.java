package com.example.quizz6;

import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class MathService {

    public String sum(String first, String second) {
        return Integer.parseInt(first) + Integer.parseInt(second) + "";
    }

    public BigInteger sumBigNrs(String first, String second) {
        BigInteger a = new BigInteger(first);
        BigInteger b = new BigInteger(second);
        return a.add(b);
    }
}
