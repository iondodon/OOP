package com.ion.lab5.task3;

public class J extends I {
    protected String j;

    J(String name){
        super("j");
        this.j = name;
    }

    @Override
    public String toString() {
        return "J{" +
                "j='" + j + '\'' +
                ", i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}
