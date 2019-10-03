package com.manchesterdigital.challenges.shoppinglistchallenge;


import java.util.ArrayList;


public class ShoppingList {
    private Item item;

    private ArrayList<Item> listOfItems = new ArrayList<>();
    private StringBuilder output = new StringBuilder();

    public ShoppingList() {
       // this.item = item;
    }


    // ---------- Add Product ----------- //

    public String addItem(Item item) {

        if (item instanceof Item) {
            listOfItems.add(item);
        }else{
            output.append("Fail to add product to cart");
        }

        if (checkItemExists(item)) {
            output.append("Product ").
                    append(item.getName()).
                    append(" added to cart.").toString();
        } else {
            output.append("Fail to add product to cart");
        }
        return output.toString();
    }

    // ---------- Remove Product ----------- //
    /**
     * finish method
     *
      */

    public String removeItem(String nameOfProduct){

        listOfItems.removeIf(e -> e.getName().equals(nameOfProduct));
   /*     for (Item e : listOfItems) {
            if (e.getName() == nameOfProduct) {
                return output.append("Product ").
                        append(item.getName()).
                        append(" added to cart.").toString();
            }
        }*/
        return "false";
    }


    // ---------- Update product in shopping cart ----------- //

    public Boolean updateItem(Item itemToUpdate, Item newItem){
        // search for item in cart
        // check if item exists
        for(Item e : listOfItems) {
            if(e.getName() == itemToUpdate.getName())
                listOfItems.set(listOfItems.indexOf(e), newItem);
        }
        if(checkItemExists(newItem) && !checkItemExists(itemToUpdate)){
            System.out.printf("Product %s successfully replaced by %s.\n", itemToUpdate.getName(), newItem.getName());
            return true;
        }
        return false;
    }

    // ---------- Check if item exists in shopping cart ----------- //

    public Boolean checkItemExists(Item item) {
        for (Item e : listOfItems) {
            if (item.compareTo(e) == 1) {
                return true;
            }
        }
        return false;
    }

    // ---------- Return Shopping cart  ----------- //
    /**
     * type ArrayList<Item> products in cart
     * @return type ArrayList<Item> products in cart
     */

    public ArrayList<Item> getListOfItems() {
            return listOfItems;
        }

    // ---------- Print all products added to cart ----------- //
    /**
     * method printIdxOfAllProductsInList() : void
     * print all products added to cart
     *
     */
    public void printIdxOfAllProductsInList(){
        listOfItems.forEach((e) -> System.out.printf("The product %s it´s at position %d \n",
                e.getName(), listOfItems.indexOf(e)));
    }


}



