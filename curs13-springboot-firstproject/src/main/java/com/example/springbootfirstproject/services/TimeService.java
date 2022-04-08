package com.example.springbootfirstproject.services;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeService {

    public LocalDateTime getTimeByZone(String timeZone) {
        return LocalDateTime.now(ZoneId.of(timeZone));
    }
}
