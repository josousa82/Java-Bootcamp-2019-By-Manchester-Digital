package com.manchesterdigital.classes.optional;

public class AirlineNotFoundException extends RuntimeException {

    public AirlineNotFoundException() {
    }

    public AirlineNotFoundException(String message) {
        super(message);
    }
}
