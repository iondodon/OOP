package com.ion.lab5.task3;

public class H extends G {
    protected String h;
    private X x = new X("x");

    H(String name){
        super("g");
        this.h = name;
    }

    @Override
    public String toString() {
        return this.h;
    }
}
