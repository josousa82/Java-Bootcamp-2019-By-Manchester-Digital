package com.manchesterdigital.interfacesfundamentals;

import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Lights lights = new Lights();
        Fan fan = new Fan();

        List<Controls> controls = new ArrayList<>();
        controls.add(lights);
        controls.add(fan);

        for (Controls control: controls) {
            control.switchOn();
            control.switchOff();
        }
    }


}
