package com.manchesterdigital.challenges.shoppinglistchallenge;

import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

       Item item = new Item("Chips");
       Item item2 = new Item("Bread");
       Item item3 = new Item("Milk");
        Item item4 = new Item("Meat");
       ShoppingList shoppingList = new ShoppingList();

        System.out.println(shoppingList.addItem(item));
        System.out.println(shoppingList.addItem(item2));
        System.out.println(shoppingList.addItem(item3));


        shoppingList.printIdxOfAllProductsInList();
        shoppingList.getListOfItems().forEach((e) -> System.out.printf("Compare test: %s = %d \n",
                                                        e.getName(), e.compareTo(item3)));

        shoppingList.updateItem(item2, item4);
        shoppingList.printIdxOfAllProductsInList();

        shoppingList.removeItem("Meat");
        shoppingList.printIdxOfAllProductsInList();

     /*   System.out.println("Compare test: " + item.compareTo(item2));
        System.out.println("True " + shoppingList.getListOfItems().contains("Milk"));*/



    }
}
