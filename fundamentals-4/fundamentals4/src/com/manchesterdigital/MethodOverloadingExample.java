package com.manchesterdigital;

public class MethodOverloadingExample {

    /*
    Method overloading,
     */

    public int multiply(int first, int second){
        return first * second;
    }

    public int multiply(int first, int second, int third){
        return first * second * third;
    }

    public int multiply(int first, int second, int third, int forth){
        return multiply(first, second, third) * forth;
    }


    public static void main(String[] args) {

        MethodOverloadingExample me = new MethodOverloadingExample();
        int result = me.multiply(3, 3);
        System.out.println(result);

        result =  me.multiply(3, 5, 10);
        System.out.println(result);

    }

    /*public <T> multiply(<T> a, <T> b){
        return a * b;
    }*/

}
