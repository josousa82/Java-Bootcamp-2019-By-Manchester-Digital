package com.manchesterdigital;

public class Dog {

    // static constant
    public static final int NUMBER_OF_TEETH = 34;

    // member variable
    private int sizeOfDog;
    private static int countInstances;
    // constructor
    public Dog(int sizeOfDog) {
        this.sizeOfDog = sizeOfDog;
    }

    // method performs action
    public String bark(){

        if(sizeOfDog > 60){
            return "WOOF!";
        } else if(sizeOfDog > 15){
            return "RUFF!";
        }
        return "YIP!";
    }

    public static void relieve(){
        System.out.println("Gone for dump...");
    }

    private static void countInstance(){
        countInstances++;
    }

}
