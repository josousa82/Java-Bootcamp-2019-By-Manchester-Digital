package com.manchesterdigital;

public class CarDealerShipRewards {
    public static void main(String[] args) {

        boolean taxYearEnded = true;
        int baseSalary = 20000;
        int numberOfSales = 1000;
        double commissionRate = 3.0;
        int bonus = 1000;

        if(taxYearEnded){
            double totalSalary = baseSalary+(numberOfSales * commissionRate);
            if(numberOfSales > 500){
                totalSalary += bonus;
                System.out.println("Total salary is (after bonus): " + totalSalary);
            }
        }
        numberOfSales = 300;
        baseSalary = 2500000;
        commissionRate = 2.0;

        if(taxYearEnded){
            double totalSalary = baseSalary + (numberOfSales * commissionRate);
            System.out.println("Total salary is: " + totalSalary);
        }

    }
}
