package com.manchesterdigital.objects.solidprinciples.liskovsubstituition;

public class ElectricCar implements MoveVehicle{

    private Engine engine;


    public void accelerator() {
        engine.powerOn(3000);
    }
}
