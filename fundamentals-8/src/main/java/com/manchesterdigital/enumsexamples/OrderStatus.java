package com.manchesterdigital.enumsexamples;

public enum OrderStatus {
    PENDING("Order is pending"),
    DISPATCHED("Order is sent"),
    DECLINED("Haha"),
    AWAITING_PAYMENT("Got no dough!"),
    PROCESSED("Done");

    private String message;

    OrderStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
