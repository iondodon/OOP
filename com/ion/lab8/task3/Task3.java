package com.ion.lab8.task3;

class Task3 {
    public static void main(String[] args){
        GeometricBody gBodies[] = {
                new Cube(0.1), new Sphere(1.5), new Parallelipiped(3.4, 1, 2)
        };

        for (GeometricBody gBody : gBodies) {
            System.out.println("Surface: " + gBody.getSurface());
            System.out.println("Volume: " + gBody.getVolume());
            System.out.println();
        }

        System.out.println("The body with the maximum volume: " +
                GeometricBodyController.getMaxVolBody(gBodies)
        );

        System.out.println("The body with the maximum surface: " +
                GeometricBodyController.getMaxVolBody(gBodies)
        );
    }
}
