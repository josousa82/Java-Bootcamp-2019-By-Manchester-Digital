package com.manchesterdigital.interfacesfundamentals;

public class Lights implements Controls {

    public void switchOn() {
        System.out.println("Pressing on switch... Switched On!");
    }

    public void switchOff() {
        System.out.println("Pressing on switch... Switched Off!");
    }
}
