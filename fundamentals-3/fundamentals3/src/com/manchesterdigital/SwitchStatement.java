package com.manchesterdigital;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class SwitchStatement {
    public static final int TEN_PENCE = 10;

    public static void main(String[] args) {
        int coinInserted = 50;

        switch (coinInserted){
            case TEN_PENCE:
                System.out.println("Inserted 10p");
                break;
            case 20:
                System.out.println("Inserted 20p");
                break;
            case 50 :
                System.out.println("Inserted 50p");
                break;
            default:
                System.out.println("No valid coin");
        }

        switch (coinInserted){
            case 10:
            case 20:
                warningMessage();
                break;
            case 4:
                System.out.println("case 4");
            default:
                System.out.println("No cases meat");
        }
        System.out.println("Change given");
    }

    public static void warningMessage(){
        System.out.println("Not enough Dollars!!!");
    }

}
