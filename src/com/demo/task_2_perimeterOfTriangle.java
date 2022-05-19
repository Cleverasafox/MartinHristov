package com.demo;

import java.util.Scanner;

public class task_2_perimeterOfTriangle {
    public static void main(String[] args) {

        System.out.println("Hello , please enter three valuables for your triangle.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first value");
        double a = sc.nextDouble();
        System.out.println("Please enter second value");
        double b = sc.nextDouble();
        System.out.println("Please enter third value");
        double c = sc.nextDouble();

        double result  = a+b+c ;

        System.out.println("The perimeter of your triangle is : " + result+ "cm");



    }
}
