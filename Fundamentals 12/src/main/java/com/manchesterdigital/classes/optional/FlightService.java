package com.manchesterdigital.classes.optional;

import java.util.Map;

public class FlightService {

    private static Map<String, FlightInformation> flights;

    static{
        flights = Map.of(
                "AB123", new FlightInformation("AB123"),
                "XK345", new FlightInformation("XK345"),
                "ST009", new FlightInformation("ST009")
        );
    }

    public FlightInformation retrieveFlight(final String flightNo){
        return flights.get(flightNo);
    }

    // one flavour good solution but not the good one

  /*  public Airline retrieveAirline(final String flightNo){

        FlightInformation flight = retrieveFlight(flightNo);

        if(flight.getAirline().isEmpty()) throw new AirlineNotFoundException();

        return flight.getAirline().get();
    }*/

    public Airline retrieveAirline(final String flightNo){
        FlightInformation flight = retrieveFlight(flightNo);

        // return with no message
        // return flight.getAirline().orElseThrow(AirlineNotFoundException::new);
        // return flight.getAirline().orElseThrow(() -> new AirlineNotFoundException("Flight created"));
        // return flight.getAirline().orElseThrow(() -> new AirlineNotFoundException());

        return flight.getAirline().orElse(new Airline());

    }

}
