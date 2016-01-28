package com.gojava.shapes;

public class Main {

    public static void main(String[] args) {
        Shape circle1 = new Shape(10.0);
        System.out.println(circle1.toStringCircle());
        Shape rect1 = new Shape(10.0, 10.0);
        System.out.println(rect1.toStringRectangle());
        Shape triangle1 = new Shape(10.0, 10.0, 10);
        System.out.println(triangle1.calcAreaTriangle());

    }
}
