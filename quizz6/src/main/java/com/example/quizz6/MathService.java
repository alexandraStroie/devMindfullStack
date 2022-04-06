package com.example.quizz6;

import org.springframework.stereotype.Component;

@Component
public class MathService {

    public String sum(String first, String second) {
        return Integer.parseInt(first) + Integer.parseInt(second) + "";
    }
}
