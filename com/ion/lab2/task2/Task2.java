package com.ion.lab2.task2;

public class Task2 {
    public static void main(String[] args){
        Queue q1 = new Queue();
        Queue q2 = new Queue(10);

        for(int i = 0; i < 100; i++){
            q2.add(i);
        }
    }
}
