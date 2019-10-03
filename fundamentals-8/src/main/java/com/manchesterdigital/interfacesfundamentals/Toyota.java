package com.manchesterdigital.interfacesfundamentals;

public class Toyota extends Vehicle implements Movement {

    public Toyota(String colour, String numberOfSeats, TransmissionType transmissionType, Double engineSize, String manufacturer) {
        super(colour, numberOfSeats, transmissionType, engineSize, manufacturer);
    }


    @Override
    public void movingForward() {
        System.out.println("Moving Toyota forward..");
    }

    @Override
    public void movingReverse() {
        System.out.println("Moving Toyota reverse..");
    }
}
