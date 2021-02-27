package com.ion.lab8.task2;

import com.ion.lab8.task1.*;

class GeometricBodyController {

    static GeometricBody getMaxVolBody(GeometricBody[] gBodies){
        GeometricBody maxVolBody = gBodies[0];
        for(GeometricBody  body : gBodies) {
            if(body.getVolume() > maxVolBody.getVolume()){
                maxVolBody = body;
            }
        }
        return maxVolBody;
    }

    static GeometricBody getMaxSurfaceBody(GeometricBody[] gBodies){
        GeometricBody maxSurBody = gBodies[0];
        for(GeometricBody  body : gBodies) {
            if(body.getSurface() > maxSurBody.getSurface()){
                maxSurBody = body;
            }
        }
        return maxSurBody;
    }

}
