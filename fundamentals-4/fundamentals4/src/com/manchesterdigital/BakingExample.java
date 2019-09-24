package com.manchesterdigital;

public class BakingExample {
    // Method main
    public static void main(String[] args) {

        switchOvenOn(6);
    } // main

    /* private can only be accessed from  the parent class
     protected can be accessed from sibling classes */

    protected void decorate(){
        System.out.println("Decorating cake...");
    } // decorate

    // Switch Oven
    protected static int switchOvenOn(int settings){

        int minutesToCook = 0;

        switch (settings){
            case 1:
                System.out.println("Set to level 1");
                minutesToCook += 20;
                break;
            case 2:
                System.out.println("Set to level 2");
                minutesToCook += 30;
                break;
            case 3:
                System.out.println("Set to level 1");
                minutesToCook += 40;
                break;
            case 4:
                System.out.println("Set to level 1");
                minutesToCook += 50;
                break;
            case 5:
                System.out.println("Set to level 1");
                minutesToCook += 60;
                break;
            default:
                System.out.println("Oven is off!");

        }

        System.out.println("Setting oven to level " + settings);

        return minutesToCook;
    } //Switch Oven



    private static void produceMixture(){
        System.out.println("Mixing....");

    } // produceMixture

} // class
