package com.example.quizz6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RoutingController {

    @Autowired
    private MathService mathService;

    @GetMapping("/add/first/{first}/second/{second}")
    public ResponseEntity getSumForTwoVariables( @PathVariable String first, @PathVariable String second) {
        return  ResponseEntity.ok(mathService.sum(first,second));
    }

    @GetMapping("/addBigNrs/first/{first}/second/{second}")
    public ResponseEntity getBigSumForTwoVariables(@PathVariable String first, @PathVariable String second) {
        return  ResponseEntity.ok(mathService.sumBigNrs(first,second));
    }
}
