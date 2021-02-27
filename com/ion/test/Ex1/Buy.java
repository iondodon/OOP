package com.ion.test.Ex1;

public class Buy extends Product {
    private int quantity;
    private float totalPrice;
    private float totalWeight;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTotalWeight(float totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public float getTotalPrice(){
        return this.totalPrice;
    }

    public float getTotalWeight(){
        return this.totalWeight;
    }
}
