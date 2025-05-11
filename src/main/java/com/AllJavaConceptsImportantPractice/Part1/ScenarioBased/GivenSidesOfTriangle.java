package com.AllJavaConceptsImportantPractice.Part1.ScenarioBased;

import java.util.Scanner;

public class GivenSidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1 angle number:");
        int side1 = sc.nextInt();
        System.out.println("Enter the side2 angle number:");
        int side2 = sc.nextInt();
        System.out.println("Enter the side3 angle number:");
        int side3 = sc.nextInt();

        if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2){
            if(side1==side2 && side2==side3){
                System.out.println("Triangle is Equilateral");
            }
            else if(side1 == side2 || side2 == side3 || side1==side3){
                System.out.println("Triangle is Isosceles");
            }
            else{
                System.out.println("Triangle is Scalane");
            }
        }
        else{
            System.out.println("Given Traingle Sides cannot form a triangle");
        }
    }
}
