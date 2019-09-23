package com.manchesterdigital;

public class IfStatements {

    /** if (condition){
           //Block/body of the IF
           } else {
            //alternative block
     }
        */

    /** if (condition){
     //Block/body of the IF
     } else if(condition) {
     //Block/body of the IF
     }else{
     //alternative block
     }
     */

    public static void main(String[] args) {
       /*int age = 50;

       if(age <= 29){
           System.out.println("Age is over 29");
       } else if(age <= 30){
           System.out.println("Age is under 30");
       } else { /// <<<<<<<<<<< This is new
           System.out.println("No it isn´t");
       }*/

       weekend(5);
    }

    public static void weekend(int var){
        switch (var){
            case 2:
            case 5:
                System.out.printf("On %s I go to the gym", var == 2? "Tuesday": "Thursday");
                break;
        }
    }

    public static void weekend1(int var){
        if(var == 1 && var <= 5) {System.out.println("It´s weekday!")};
        System.out.println(2 == var ?"On Tuesday I go to the gym":
                var == 5? "On Thursday I go to the gym": var == 7?"On Sunday I go to the gym":"");
        }
    }
}
