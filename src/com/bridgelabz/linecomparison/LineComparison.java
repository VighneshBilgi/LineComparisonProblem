package com.bridgelabz.linecomparison;

import java.lang.Math;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter end point co-ordinates for Line 1:");
        System.out.println("Enter X1 value is :");
        int x1 = sc.nextInt();

        System.out.println("Enter Y1 value is :");
        int y1 = sc.nextInt();

        System.out.println("Enter X2 value is :");
        int x2 = sc.nextInt();

        System.out.println("Enter Y2 value is :");
        int y2 = sc.nextInt();

        System.out.println("Enter end point co-ordinates for Line 2:");
        System.out.println("Enter X3 value is :");
        int x3 = sc.nextInt();

        System.out.println("Enter Y3 value is :");
        int y3 = sc.nextInt();

        System.out.println("Enter X4 value is :");
        int x4 = sc.nextInt();

        System.out.println("Enter Y4 value is :");
        int y4 = sc.nextInt();

        double length1 = Math.pow((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)),0.5);
        double length2 = Math.pow((Math.pow(x4-x3,2)+Math.pow(y4-y3,2)),0.5);

        System.out.println("Length of Line 1 is: " + length1);
        System.out.println("Length of Line 2 is: " + length2);

        if( (Double.toString(length1) ).equals( Double.toString(length2) ) == true){
            System.out.println("The Lines are equal");
        }
        else{
            System.out.println("The Lines are NOT equal");
        }

    }
}
