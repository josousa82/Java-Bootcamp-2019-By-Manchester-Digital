package com.manchesterdigital.interfacesfundamentals;

public abstract class Vehicle {

    private final String colour;
    private final String numberOfSeats;
    private final TransmissionType transmissionType;
    private final Double engineSize;
    private final String manufacturer;


    public Vehicle(String colour, String numberOfSeats, TransmissionType transmissionType, Double engineSize, String manufacturer) {
        this.colour = colour;
        this.numberOfSeats = numberOfSeats;
        this.transmissionType = transmissionType;
        this.engineSize = engineSize;
        this.manufacturer = manufacturer;
    }

    //public abstract void superCharge();
}
