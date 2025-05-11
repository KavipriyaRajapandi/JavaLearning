package com.JavaCollege.Functions;

import java.util.Scanner;

public class SimpleFunctionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.next();
        String personalized = myGreet(name);
        System.out.println(personalized);
    }
    static String myGreet(String name){
        return "Hello "+name;
    }

}
