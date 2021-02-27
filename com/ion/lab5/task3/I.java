package com.ion.lab5.task3;

public class I extends H {
    protected String i;

    I(String name){
        super("h");
        this.i = name;
    }

    @Override
    public String toString() {
        return this.i;
    }
}
