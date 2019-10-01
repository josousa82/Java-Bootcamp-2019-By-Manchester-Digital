package com.manchesterdigital;

public class WhileLoopExampleGrowthRate {



    public static void main(String[] args) {
        /**
         *
         * while(boolean expression){
         *     // body logic
         * }
         *
         */

        double growthRate = 0.04d; // 4%
        int population = 800; // initial population of puffins
        int year = 0; // i.e present time

        while(population <= 1200){

            Double tempPopulation = new Double(population * (1 + growthRate));
            population = tempPopulation.intValue();
            year++;
        }

        System.out.println("year = " + year);
    }
}
