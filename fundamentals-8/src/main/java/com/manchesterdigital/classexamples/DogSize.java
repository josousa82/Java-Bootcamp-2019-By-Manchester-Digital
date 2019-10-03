package com.manchesterdigital.classexamples;

public enum DogSize {
    SMALL("meow"),
    MEDIUM("ruff"),
    LARGE("WOOF");

    private final String noise;

    DogSize(String noise) {
        this.noise = noise;
    }

    public String getNoise() {
        return noise;
    }
}
