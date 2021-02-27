package com.ion.lab1.task1;

public class Monitor {
    private String color;
    private int height;
    private int weight;
    private int resolution;

    Monitor(String color, int height, int weight, int resolution){
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.resolution = resolution;
    }

    public void updateColor(String new_color){
        this.color = new_color;
    }

    public void updateHeight(int new_height){
        this.height  = new_height;
    }

    public void updateWeight(int new_weight){
        this.height  = new_weight;
    }

    public void updateResolution(int new_resoltion){
        this.resolution = new_resoltion;
    }

    public String getColor(){
        return this.color;
    }

    public int getHeight(){
       return this.height;
    }

    public int getWeight(){
        return this.weight;
    }

    public int getResolution(){
        return this.resolution;
    }

    static void compare(Monitor monitor1, Monitor monitor2){
        if (monitor1.getColor() == monitor2.getColor()) {
            System.out.println("Colors are equal");
        } else System.out.println("Colors are not equal.");

        if (monitor1.getResolution() == monitor2.getResolution()) {
            System.out.println("Resolutions are equal");
        } else System.out.println("Resolutions are not equal.");

        if (monitor1.getHeight() == monitor2.getHeight()) {
            System.out.println("Heights are equal");
        } else System.out.println("Heights are not equal.");

        if (monitor1.getWeight() == monitor2.getWeight()) {
            System.out.println("Heights are equal");
        } else System.out.println("Heights are not equal.");
    }

}
