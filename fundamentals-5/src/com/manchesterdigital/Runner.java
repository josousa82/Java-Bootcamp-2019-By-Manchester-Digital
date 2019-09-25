package com.manchesterdigital;

public class Runner {

    public static void main(String[] args) {

       /* String name = "Johanna";
        String surname = "Sousa";
        String surname2 = "Sousa";

        Boolean result = Utility.isEven(3);

        System.out.println("Result: " + result);
        System.out.println("Result: " + Utility.isEven(2));

        // Match strings
        System.out.println(Utility.isNamesMatch(name, surname).hashCode());
        System.out.println(Utility.isNamesMatch(surname2, surname).hashCode());

        Utility utility = new Utility();
        System.out.println(utility.hashCode());

        // Instantiating the Dog class

        Dog poodle = new Dog(20);
        System.out.println(poodle.bark());

        Dog rottweiler = new Dog(20);
        System.out.println(rottweiler.bark());*/
        Long id;

        // order of catch´s matters, catch the most obvious
        try {
           Long aLong = Utility.convertStringToLong("12345698");
           System.out.println(aLong);
       }
       catch(NumberFormatException e){
           e.printStackTrace();
           System.err.println("Input provided was not a valid number" + e);
           id = Long.MAX_VALUE;
       }
        catch (IllegalArgumentException e){
            e.printStackTrace();
            System.err.println("Argument provided is not valid" + e);
        }
      //  System.out.println("Id is: " + id);

        /*// Dont do that, don´t use Throwable,
        try{
            Long num2 = Utility.convertStringToLong("23");
        }catch (Throwable e){
            // don´t use Throwable empty
        }

        try{
            Long num2 = Utility.convertStringToLong("23");
        }catch (NumberFormatException e){
            // don´t do this
            System.out.println(e);
            throw e;
        }*/

        // FileInputStream is = new FileInputStream();
/*
        try{
            Long num2 = Utility.convertStringToLong("23");
        }catch (NumberFormatException e){
            System.err.println(e);
            throw  new IllegalArgumentException("Invalid input ", e)
            }finally{
              //is.close(()
            }

        }*/

    }
}
