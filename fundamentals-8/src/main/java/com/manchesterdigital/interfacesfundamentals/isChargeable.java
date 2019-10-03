package com.manchesterdigital.interfacesfundamentals;

public interface isChargeable {
    void superCharge();

    default void describe(){
        System.out.println("Im green!");
    }

    default String describe(String test){
        System.out.println("Im green!");
        return test;
    }

}
