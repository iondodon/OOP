package com.ion.lab5.task2;

public class C extends B {
    protected String c;

    C(String name){
        super("b");
        this.c = name;
    }

    @Override
    public String toString() {
        return this.c;
    }
}
