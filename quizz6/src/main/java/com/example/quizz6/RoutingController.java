package com.example.quizz6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RoutingController {

    @Autowired
    private MathService mathService;

    @GetMapping("/add/first/{first}/second/{second}")
    public ResponseEntity getSumForTwoVariables(@PathVariable String first, String second) {
        return  ResponseEntity.ok(mathService.sum(first,second));

    }
}
