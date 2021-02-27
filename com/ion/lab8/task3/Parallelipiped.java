package com.ion.lab8.task3;

class Parallelipiped implements GeometricBody{
    private double height;
    private double length;
    private double depth;

    Parallelipiped(double height, double length, double depth){
        this.height = height;
        this.length = length;
        this.depth = depth;
    }

//    double getHeight(){
//        return this.height;
//    }

//    double getLength(){
//        return this.length;
//    }

//    double getDepth(){
//        return this.depth;
//    }

    @Override
    public double getVolume(
    ){
        return this.height * this.length * this.depth;
    }

    @Override
    public double getSurface(){
        return this.height * this.length * 4 + this.height * this.depth * 2;
    }
}
