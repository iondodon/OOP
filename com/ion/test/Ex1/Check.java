package com.ion.test.Ex1;

public class Check extends Buy {

    public void showProduct(){
        System.out.println("Product product name " + getProductName());
        System.out.println("Product price " + getPrice());
        System.out.println("Product weight " + getWeight());
    }

    public void showPurchase(){
        System.out.println("Quantity " + getQuantity());
        System.out.println("Total price " + getTotalPrice());
        System.out.println("Total weight " + getTotalWeight());
    }

}
