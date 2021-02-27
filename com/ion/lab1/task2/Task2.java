package com.ion.lab1.task2;

public class Task2 {
    public static void main(String[] args){
        University utm = new University("UTM", 1964, 3);
        University usm = new University("USM", 1960, 2);
        University asem = new University("ASEM", 1991, 2);

        System.out.println("Students average for UTM: " + utm.getStudentsAverage() );
        System.out.println("Students average for UTM: " + usm.getStudentsAverage() );
        System.out.println("Students average for UTM: " + asem.getStudentsAverage() );
    }
}
