package com.gojava.ftocconverter;

/**
 * Created by Kell on 28.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        double cels = 100.0;
        System.out.println("F = " + Degrees.ctof(cels));
        double far = 212.0;
        System.out.println("C = " + Degrees.ftoc(far));



    }
}
