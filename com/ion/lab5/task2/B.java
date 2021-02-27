package com.ion.lab5.task2;

public class B extends A {
    protected String b;

    B(String name){
        super("a", new X("x"));
        this.b = name;
    }

    @Override
    public String toString() {
        return this.b;
    }
}
