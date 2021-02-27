package com.ion.lab5.task2;

public class A {
    protected String a;
    public X x;

    A(String name, X x){
        this.a = name;
    }

    @Override
    public String toString() {
        return this.a;
    }
}
