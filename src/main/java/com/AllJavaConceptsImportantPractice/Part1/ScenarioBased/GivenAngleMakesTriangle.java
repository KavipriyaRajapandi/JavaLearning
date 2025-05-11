package com.AllJavaConceptsImportantPractice.Part1.ScenarioBased;

import java.util.Scanner;

public class GivenAngleMakesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Angle:");
        int first = sc.nextInt();
        System.out.println("Enter the Second Angle:");
        int second = sc.nextInt();
        System.out.println("Enter the Third Angle:");
        int third = sc.nextInt();

        if(first>0 && second>0 &&third>0 && (first + second + third == 180)){
            System.out.println("Triangle");
        }
        else{
            System.out.println("Not a Triangle");
        }
    }
}
