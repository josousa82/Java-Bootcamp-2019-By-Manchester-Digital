package com.parkingcost;

public class ParkingCost {

    private String carOrVan;
    private Double time;

    public ParkingCost(Double time) {

        this.time = time;
    }

    public ParkingCost(Double time, String carOrVan) {
        this.time = time;
        this.carOrVan = carOrVan;
    }

    public static Integer calculateParkingCost(Double time, String carOrVan){

        Integer cost = 0;
        if (time >= 0 && time < 5){
            cost = 300;}
        else if (time >= 5 && time < 10){
            cost = 350;
        }
        else if (time >= 10 && time < 15)
        {
            cost = 500;
        }
        else if (time >=15 && time < 20)
        {
            cost = 700;
        }
        else if (time >= 20 && time < 24 )
        {cost = 400;
        }

        if (carOrVan.equalsIgnoreCase("van")) {
            cost = cost*2;
        }
        return cost;
    }
}
