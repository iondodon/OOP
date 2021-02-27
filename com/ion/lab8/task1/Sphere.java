package com.ion.lab8.task1;

public class Sphere extends GeometricBody {
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

//    double getRadius(){
//        return this.radius;
//    }

    @Override
    public double getVolume(){
        return 4.0 / 3.0 * Math.PI * this.radius;
    }

    @Override
    public double getSurface(){
        return 4 * Math.PI * radius * radius;
    }
}
