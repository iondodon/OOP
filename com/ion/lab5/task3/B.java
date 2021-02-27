package com.ion.lab5.task3;

public class B extends A {
    protected String b;

    B(String name){
        super("a");
        this.b = name;
    }

    @Override
    public String toString() {
        return this.b;
    }
}
