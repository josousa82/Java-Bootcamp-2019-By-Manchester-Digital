package com.manchesterdigital.challenges.navigator;

public class Navigator {
    private  String userDirection;
    private  Integer userSteps;
    private StringBuilder output;
    Integer startingLocation = 0;
    Directions directions;


    public Navigator(String userDirection, Integer userSteps) {
        this.userDirection = userDirection;
        this.userSteps = userSteps;
    }

    public String moving(){

       return " ";
    }

    /*public String facing(char userDir){

        switch (userDir){
            case N:
                this.userDirection = directions.N.getDirection();
                break;
            case "S":
                this.userDirection = directions.S.getDirection();
                break;
            case "E":
                this.userDirection = directions.E.getDirection();
                break;
            case "W":
                this.userDirection = directions.W.getDirection();
                break;
        }

        output.append(this.userDirection);
        System.out.println(output);
        return output.toString();
    }*/
}
