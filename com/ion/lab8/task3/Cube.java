package com.ion.lab8.task3;

class Cube implements GeometricBody {
    private double side;

    public Cube(double side){
        this.side = side;
    }

//    double getSide(){
//        return this.side;
//    }

    @Override
    public double getVolume(){
        return this.side * this.side * this.side;
    }

    @Override
    public double getSurface(){
        return this.side * 2 * 6;
    }
}
