package com.manchesterdigital.classexamples;

public class Phone {
    private Boolean onOff;
    private Boolean call;
    private String textMessage;
    private Boolean hasCamera;
    private final Integer batteryLevel;



    public Phone(Integer batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void batteryLevelWarning(){
        if(batteryLevel <= 2) {
            System.out.println("Phone will turn off in 2 minutes, very low battery!");
            onOff = false;
        }else if(batteryLevel <= 15){
            System.out.println("Low battery, please charge your phone ");
        }
    }

    public static void main(String[] args) {
    }


}
