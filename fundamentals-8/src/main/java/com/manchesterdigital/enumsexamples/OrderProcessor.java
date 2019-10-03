package com.manchesterdigital.enumsexamples;

public class OrderProcessor {

    private OrderStatus orderStatus;

    public OrderProcessor(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void obtainCurrentOrderStatus(){
        if (orderStatus == OrderStatus.DISPATCHED) {
            System.out.println("You should receive your item soon ..");
        }else{
            System.out.println("You have no idea. However your order is at stage: " +
                    orderStatus.toString());
        }
    }


    public void printOrderStatus(){
        System.out.println(orderStatus.getMessage());
    }
}
