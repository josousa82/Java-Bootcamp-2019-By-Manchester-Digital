package com.manchesterdigital.objects.solidprinciples.liskovsubstituition;

public class Engine {
    public void on(){
        System.out.println("Engine is on");
    }

    public void powerOn(Integer revs){
        System.out.println("Reeving.." + revs);
    }

}
