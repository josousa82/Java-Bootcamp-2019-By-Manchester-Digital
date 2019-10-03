package com.manchesterdigital.objects.solidprinciples.liskovsubstituition;

public class MotorCar implements MoveVehicle, HasEngine {
    private Engine engine;


    public void startEngine() {
        engine.on();
    }

    public void accelerator() {
        engine.powerOn(1000);
    }
}
