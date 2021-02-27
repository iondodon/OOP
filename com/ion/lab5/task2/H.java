package com.ion.lab5.task2;

public class H extends G {
    protected String h;

    H(String name){
        super("g");
        this.h = name;
    }

    @Override
    public String toString() {
        return this.h;
    }
}
