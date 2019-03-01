package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double c = pow((x1 + x2), 2) + pow((y1 + y2), 2);
        return sqrt(c);
    }

    public static void main(String[] args) {
    }
}
