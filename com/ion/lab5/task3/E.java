package com.ion.lab5.task3;

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
