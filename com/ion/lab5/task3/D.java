package com.ion.lab5.task3;

public class D extends C {
    protected String d;
    protected X x = new X("xx");

    D(String name){
        super("c");
        this.d = name;
    }

    @Override
    public String toString() {
        return this.d;
    }
}
