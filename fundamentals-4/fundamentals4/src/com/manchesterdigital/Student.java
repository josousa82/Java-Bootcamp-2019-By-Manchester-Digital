package com.manchesterdigital;

import java.util.Objects;

public class Student {
    // member variable

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    public static void main(String[] args) {

        Student englishStudent = new Student("Amy");
        System.out.println(englishStudent.getName());

        Student frenchStudent = new Student("jose", 37);
        System.out.println(frenchStudent.getName() + " and my age is : " + frenchStudent.getAge());




    }
}
