package com.example.springbootfirstproject.controller;

import com.example.springbootfirstproject.services.MathOps;
import com.example.springbootfirstproject.services.TimeService;
import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

@RestController
public class RoutingController {


//    @GetMapping(value = "/time")
//    public Date getTime(Locale locale, TimeZone timeZone){
//        System.out.println("Time Page Requested, locale = " + locale);
//        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
//        Date date = new Date();
//        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//        String formattedDate = dateFormat.format(date);
//
//        return date;
//    }

    private TimeService timeZoneService;

    private static Faker faker = new Faker();

    @GetMapping(value="/time")
    public LocalDateTime currentHour(@RequestParam(name = "timeZone") String timeZone) {
        return timeZoneService.getTimeByZone(timeZone);
    }

    @GetMapping(value = "/harry-potter")
    public String getHarryPotter() {
        String name = faker.name().fullName();
        return name;
    }

    @PostMapping(path = "/math-service")
    public int mathService(@RequestBody MathOps mathOps) {
        System.out.println("mathOps" + mathOps);
//        return mathOps.sum(mathOps.getFirstNumber(),mathOps.getSecondNumber());
        return mathOps.mathOperations(mathOps.getFirstNumber(), mathOps.getSecondNumber(),mathOps.getOperation());
    }
}
