package com.ion.lab2.task1;

public class Box {
    private float height;
    private float width;
    private float depth;

    Box(){
        this.height = this.depth = this.width = 1;
    }

    Box(float length){
        this.height = this.depth = this.width = length;
    }

    Box(float width, float depth, float height){
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    float getVolume(){
        return this.width * this.width * this.width;
    }

    float getArea(){
        return 2 * this.width * this.depth  + 4 * this.width * this.height;
    }
}
