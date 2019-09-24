package com.manchesterdigital;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CodeChallenge5 {

    public static final int CONST_13 = 13;

    public static int luckySum(int a, int b, int c){

        if(a == CONST_13){
           return 0;
        }else if(b == CONST_13) {
            return a;
        }else if(c == CONST_13){
            return a + b;
        }else{
            return a + b + c;
        }

    }

    public static void main(String[] args) {
        System.out.println(luckySum(1, 2, 3));
        System.out.println(luckySum(1, 2, 13));
        System.out.println(luckySum(1, 13, 3));
    }
}
