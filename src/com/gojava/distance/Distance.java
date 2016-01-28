package com.gojava.distance;

/**
 * Created by Kell on 28.01.2016.
 */
public class Distance {
    private double pointAX, pointAY, pointBX, pointBY;

    public Distance(double pointAX, double pointAY, double pointBX, double pointBY) {
        this.pointAX = pointAX;
        this.pointAY = pointAY;
        this.pointBX = pointBX;
        this.pointBY = pointBY;
    }
    public double calcDistance(){
        return Math.sqrt(Math.pow(pointBX-pointAX, 2)+Math.pow(pointBY-pointAY, 2));
    }

}
