package com.demo;

import java.util.Scanner;

public class task_1_name {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Please enter your first name");

        String firstName = sc.nextLine();

        System.out.println("Please enter your Middle name");

        String middleName = sc.nextLine();

        System.out.println("Please enter your Last name");

        String lastName = sc.nextLine();

        System.out.println("Your full name sir/madam is " + (firstName + " " + middleName +" " + " "+lastName));
    }
}
