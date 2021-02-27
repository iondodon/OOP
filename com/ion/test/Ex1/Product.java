package com.ion.test.Ex1;

public class Product {
    private String productName;
    private float price;
    private float weight;

    public void setProductName(String name) {
        this.productName = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private void m(){
        System.out.println("Ion");
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getProductName(){
        return this.productName;
    }

    public float getPrice(){
        return this.price;
    }

    public float getWeight(){
        return this.weight;
    }
}
