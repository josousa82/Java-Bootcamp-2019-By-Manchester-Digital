package com.manchesterdigital;

import java.util.ArrayList;

public class ForEachExample {
    /**
     * 
     * for(datatype instance : collections){
     *     // some logic for the loop
     * }
     */

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Callum");
        students.add("Andrew");
        students.add("Trump");
        
        for(String student:students){
            System.out.println("student = " + student);
        }


    }
}
