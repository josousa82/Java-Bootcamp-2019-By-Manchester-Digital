package com.manchesterdigital.classexamples;

public class DogBuilderPattern {
    private String bread;
    private String name;
    private String colour;
    private String weight;
    private Integer age;
    private Integer dogYearsAge;

    public DogBuilderPattern(String bread, String colour, String weight, Integer age, Integer dogYearsAge) {
        this.bread = bread;
        this.colour = colour;
        this.weight = weight;
        this.age = age;
        this.dogYearsAge = dogYearsAge;
    }

    public class Build{
        private String name;
        private String bread;

        public Build(String name, String bread) {
            this.name = name;
            this.bread = bread;
        }

    }
}
