package com.manchesterdigital.classes.optional;

/**
 * Simple POJO airline
 *
 */
public class Airline {
    private String name;
    private String moto;

    public Airline() {
    }

    public Airline(String name, String moto) {
        this.name = name;
        this.moto = moto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }
}
