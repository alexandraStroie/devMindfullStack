package com.example.curs15restapijson;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class HomeController {

    private static final String API_KEY = "devmind-api-key";
    private static final String AUTH_IDENTIFIER = "authentication";

    @PostMapping(value ="/messages",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<MessageForApp> postAMessage(
            @RequestBody MessageForApp messageForApp,
            @RequestHeader (value = AUTH_IDENTIFIER, defaultValue = "none") String authentication ) throws IllegalAccessException {

        if(!authentication.equals(API_KEY)) {
            throw new IllegalAccessException("Api key is missing");
        }
        return new ResponseEntity<>(messageForApp, HttpStatus.CREATED);
    }

    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<String> handleException(IllegalAccessException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
