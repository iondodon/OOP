package com.ion.lab5.task2;

public class F extends E {
    protected String f;

    F(String name){
        super("e");
        this.f = name;
    }

    @Override
    public String toString() {
        return this.f;
    }
}
