package com.JavaCollege.ConceptProgram;

import java.util.Scanner;

public class TemparatureConversionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temparature in C:");
        float celcius = sc.nextFloat();
       // float farenheit = sc.nextFloat();

        float fahrenheit = (celcius * 9/5) + 32;
        System.out.println(fahrenheit);


    }
}
