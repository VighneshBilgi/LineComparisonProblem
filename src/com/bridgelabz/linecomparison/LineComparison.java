package com.bridgelabz.linecomparison;

import java.lang.Math;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X1 value is :");
        int x1 = sc.nextInt();

        System.out.println("Enter Y1 value is :");
        int y1 = sc.nextInt();

        System.out.println("Enter X2 value is :");
        int x2 = sc.nextInt();

        System.out.println("Enter Y2 value is :");
        int y2 = sc.nextInt();


        double length = Math.pow((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)),0.5);

        System.out.println("Euclidean Distance between (" + x1 + "," + y1 +") and (" + x2 + "," + y2 +") is :" + length);
    }
}
