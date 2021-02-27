package com.ion.lab5.task2;

public class D extends C {
    protected String d;

    D(String name){
        super("c");
        this.d = name;
    }

    @Override
    public String toString() {
        return this.d;
    }
}
