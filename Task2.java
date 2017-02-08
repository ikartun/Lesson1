package by.epam.tr.lesson1;

import static java.lang.Math.PI;
import static java.lang.Math.round;

public class Task2{

    public static void main(String[] args) {
        double radius = 5;
        System.out.println("Length for circle of radius " + radius + " is about " + round(getCircleLength(radius)));
        System.out.println("Square of circle of radius " + radius + " is about " + round(getCircleSquare(radius)));
    }
    
    private static double getCircleLength(double radius) {
        return 2*PI*radius;
    }    
    
    
    private static double getCircleSquare(double radius) {
        return PI*Math.pow(radius, 2);
    }
}