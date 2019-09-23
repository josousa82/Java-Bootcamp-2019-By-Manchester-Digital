package com.manchesterdigital;

public class CodeChallenge3 {

    public static void weekend(int var) {
        switch (var) {
            case 2:
            case 5:
                System.out.printf("On %s I go to the gym", var == 2 ? "Tuesday" : "Thursday");
                break;
        }
    }
}
/*
    public static void weekend1(int var){
        if(var == 1 && var <= 5) {System.out.println("It´s weekday!")}
        System.out.println(2 == var ?"On Tuesday I go to the gym": var == 5? "On Thursday I go to the gym": var == 7?"On Sunday I go to the gym":"");
    }
}
*/
