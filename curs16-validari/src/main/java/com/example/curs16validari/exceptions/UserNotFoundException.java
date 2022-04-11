package com.example.curs16validari.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
    }

    public UserNotFoundException(String reason) {
        super(reason);
    }

}
