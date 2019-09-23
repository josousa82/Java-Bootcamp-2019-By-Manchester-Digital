package com.manchesterdigital;

public class Student {

    public static final String CLASS_NAME = "Bootcamp";

    // this is an example of an instance variable
    public String studentName;
    private String studentNamePrivate;

    //Constructor
    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void printDetails(){
        System.out.println("Student´s name is " + studentName + " Class is: " + CLASS_NAME);
        System.out.println("Student´s name private  is " + studentNamePrivate);
    }

    public static void main(String[] args) {

        Student name = new Student("Emglin");
        name.printDetails();
    }

}
