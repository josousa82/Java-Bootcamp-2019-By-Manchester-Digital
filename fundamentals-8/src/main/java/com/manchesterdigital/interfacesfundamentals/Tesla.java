package com.manchesterdigital.interfacesfundamentals;

public class Tesla extends Vehicle implements Movement, isChargeable {
    public Tesla(String colour, String numberOfSeats, TransmissionType transmissionType, Double engineSize, String manufacturer) {
        super(colour, numberOfSeats, transmissionType, engineSize, manufacturer);
    }

    @Override
    public void movingForward() {
        System.out.println("Moving Faster ....... forward..");
    }

    @Override
    public void movingReverse() {
        System.out.println("Reverse.....");
    }

    @Override
    public void superCharge() {

    }
}
