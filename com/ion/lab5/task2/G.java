package com.ion.lab5.task2;

public class G extends F {
    protected String g;

    G(String name){
        super("f");
        this.g = name;
    }

    @Override
    public String toString() {
        return this.g;
    }
}
