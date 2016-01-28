package com.gojava;

/**
 * Created by Kell on 28.01.2016.
 */
class Shape {
    private double sideA, sideB, sideC;
    private double width, height;
    private double radius;
    private String shapeType;
    private double calcArea;

    public Shape(double radius) {
        this.radius = radius;
        this.shapeType = "Circle";
        this.calcArea = calcAreaCircle();
    }

    public Shape(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.shapeType = "Rectangle";
        this.calcArea = calcAreaRectangle()
    }

    public Shape(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.shapeType = "Triangle";
        this.calcArea = calcAreaTriangle();
    }

    public double calcAreaCircle() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double calcAreaRectangle() {
        return width * height;
    }
    public double calcAreaTriangle() {
        double p = ((sideA + sideB + sideC) / 2);
        double s = p * (p - sideA) * (p - sideB) * (p - sideC);
        return Math.sqrt(s);
    }

    public String toStringCircle() {
        return "Shape{" +
                "radius=" + radius +
                ", shapeType='" + shapeType + '\'' +
                ", calcArea=" + calcArea +
                '}';
    }

    @Override
    public String toString() {
        return "Shape{" +
                "width=" + width +
                ", height=" + height +
                ", shapeType='" + shapeType + '\'' +
                ", calcArea=" + calcArea +
                '}';
    }
}
