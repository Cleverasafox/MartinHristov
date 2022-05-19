package com.demo;

import java.util.Scanner;

public class task_3_areaOfaTriangle {
    public static void main(String[] args) {


        System.out.println("Hello , please enter three valuables for your triangle.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first side");
        double sideA = sc.nextDouble();
        System.out.println("Please enter second side");
        double sideB = sc.nextDouble();

        double result = (sideA * sideB ) / 2;

        System.out.println("The area of your triangle is : " + result + "cm");
    }
}