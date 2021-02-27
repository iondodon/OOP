package com.ion.lab1.task1;

public class Task1 {
    public static void main(String[] args){
        Monitor acer = new Monitor("black", 50, 100, 1700);
        Monitor samsung = new Monitor("white", 60, 100, 1800);
        Monitor.compare(acer, samsung);
    }
}