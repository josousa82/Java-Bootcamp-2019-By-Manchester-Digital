package com.manchesterdigital.enumsexamples;

public class Scratch {

    public static final String RED_COLOUR = "RED";

    public static void main(String[] args) {

        System.out.println("RED_COLOUR = " + RED_COLOUR);

        System.out.println(RainbowColours.BLUE.toString());

        OrderProcessor orderProcessor = new OrderProcessor(OrderStatus.AWAITING_PAYMENT);

        orderProcessor.printOrderStatus();
        orderProcessor.obtainCurrentOrderStatus();
    }

}
