package com.ion.lab2.task1;

public class Task1 {
    public static void main(String[] args){
        Box box1 = new Box();
        Box box2 = new Box(3);
        Box box3 = new Box(1,2,3);

        System.out.println("Area of box1 = " + box1.getArea());
        System.out.println("Area of box1 = " + box1.getVolume());
        System.out.println();

        System.out.println("Area of box2 = " + box2.getArea());
        System.out.println("Area of box2 = " + box2.getVolume());
        System.out.println();

        System.out.println("Area of box3 = " + box3.getArea());
        System.out.println("Area of box3 = " + box3.getVolume());
    }
}
