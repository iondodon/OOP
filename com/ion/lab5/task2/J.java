package com.ion.lab5.task2;

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
                ", x=" + x +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
