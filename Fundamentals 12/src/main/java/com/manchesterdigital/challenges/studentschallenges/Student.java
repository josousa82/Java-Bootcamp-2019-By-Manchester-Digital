package com.manchesterdigital.challenges.studentschallenges;

public class Student {

    private final String name;
    private final String classType;
    private final Integer score;



    public Student(String name, String classType, Integer score) {
        this.name = name;
        this.classType = classType;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getClassType() {
        return classType;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public String toString() {

        return "Student{" +
                "name='" + name + '\'' +
                ", classType='" + classType + '\'' +
                ", score=" + score +
                '}';
    }
}
