package com.JavaQspiders.Test.AssignmentIfElseSwitch;

import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the alphabet");

        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Not and alphabet");
        }

    }
}
