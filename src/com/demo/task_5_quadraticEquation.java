package com.demo;

import java.util.Scanner;
import java.lang.Math;

public class task_5_quadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first value a:");
        double a = sc.nextDouble();
        System.out.println("Please enter second value b:");
        double b = sc.nextDouble();
        System.out.println("Please enter third value c:");
        double c = sc.nextDouble();
        double d = b*b -4.0* a*c;
        double r1;
        double r2;
        // if d(discriminant) is a positive number
        if (d>0.0) {
            r1 = (-b + Math.pow(d,0.5)) / (2.0*a);
            r2 = (-b - Math.pow(d,0.5)) / (2.0*a);
            System.out.println("The roots are " + r1 + " and " + r2);
            // if d is =
        } else if ( d == 0.0) {
            double r3 = -b / (2.0 * a);
            System.out.println("The root is " + r3);
        }
        // last case d is negative number
        else{
            System.out.println("Roots are not real.");
        }


    }
}
