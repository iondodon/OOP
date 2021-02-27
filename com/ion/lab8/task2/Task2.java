package com.ion.lab8.task2;

import com.ion.lab8.task1.*;

public class Task2 {
    public static void main(String[] args){
        GeometricBody gBodies[] = {
                new Cube(0.1), new Sphere(1.5), new Parallelipiped(3.4, 1, 2)
        };

        System.out.println("The body with the maximum volume: " +
                GeometricBodyController.getMaxVolBody(gBodies)
        );

        System.out.println("The body with the maximum surface: " +
                GeometricBodyController.getMaxSurfaceBody(gBodies)
        );
    }
}
