package com.ion.lab5.task2;

public class E extends D {
    protected String e;

    E(String name){
        super("d");
        this.e = name;
    }

    @Override
    public String toString() {
        return this.e;
    }
}
