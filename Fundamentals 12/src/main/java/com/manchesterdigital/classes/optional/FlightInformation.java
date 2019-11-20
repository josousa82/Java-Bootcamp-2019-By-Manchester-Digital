package com.manchesterdigital.classes.optional;

import java.util.Optional;

/**
 * Simple POJO class for flight information
 *
 */
public class FlightInformation{

    private final String flightNo;
    private String destination;
    private Optional<Airline> airline;

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Optional<Airline> getAirline() {
        return airline;
    }

    public void setAirline(Optional<Airline> airline) {
        this.airline = airline;
    }

    public FlightInformation(String flightNo) {
        this.flightNo = flightNo;
    }
}
