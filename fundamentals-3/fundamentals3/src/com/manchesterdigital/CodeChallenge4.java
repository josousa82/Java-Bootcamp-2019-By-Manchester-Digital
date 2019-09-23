package com.manchesterdigital;

public class CodeChallenge4 {

    public static void main(String[] args) {
        System.out.println(allowedIn(8, 5));
        System.out.println(allowedIn(3, 5));

    }

    public static String allowedIn(int style, double bribe){
        return !(style >= 8 && bribe >= 5) ? "Not allowed in": "";
    }


}
