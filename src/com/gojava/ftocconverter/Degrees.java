package com.gojava.ftocconverter;

/**
 * Created by Kell on 28.01.2016.
 */
public class Degrees {
    static double ctof(double cels){
        return (1.8 * cels) + 32;
    }
    static double ftoc(double far){
        return (far - 32) * 5 / 9;
    }
}
