package com.ion.lab5.task3;

public class A {
    protected String a;
    protected X x = new X("xxx");

    A(String name){
        this.a = name;
    }

    @Override
    public String toString() {
        return this.a;
    }
}
