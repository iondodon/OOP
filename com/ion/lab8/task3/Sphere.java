package com.ion.lab8.task3;

class Sphere implements GeometricBody {
    private double radius;

    Sphere(double radius){
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
