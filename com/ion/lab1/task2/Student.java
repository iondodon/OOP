package com.ion.lab1.task2;

public class Student {
    private String name;
    private int age;
    private float mark;

    public float getMark(){
        return this.mark;
    }

    Student(String name, int age, float mark){
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
}
