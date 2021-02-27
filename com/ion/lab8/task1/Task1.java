package com.ion.lab8.task1;

class Task1 {
    public static void main(String[] args){
        GeometricBody gBodies[] = {
                new Cube(2.0), new Sphere(1.5), new Parallelipiped(3.4, 1, 2)
        };

        for (GeometricBody gBody : gBodies) {
            System.out.println("Surface: " + gBody.getSurface());
            System.out.println("Volume: " + gBody.getVolume());
            System.out.println();
        }
    }
}