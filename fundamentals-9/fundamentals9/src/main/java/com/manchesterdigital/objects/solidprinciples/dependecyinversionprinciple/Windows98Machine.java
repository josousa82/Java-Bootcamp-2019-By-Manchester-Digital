package com.manchesterdigital.objects.solidprinciples.dependecyinversionprinciple;


public class Windows98Machine {
    private final KeyboardTest standardKeyboard;
    private final MonitorTest monitor;

    public Windows98Machine(KeyboardTest standardKeyboard, MonitorTest monitor) {
        this.standardKeyboard = standardKeyboard;
        this.monitor = monitor;
    }
}
