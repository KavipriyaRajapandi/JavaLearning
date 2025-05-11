package com.AllJavaConceptsImportantPractice.Part1.SwitchCase;

import java.util.Scanner;

public class VowelOrConsonant {
    //CANNOT USE LONG,FLOAT,DOUBLE,BOOLEAN WITH SWITCH.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u': {
                System.out.println("Vowel");
                break;
            }
            default:
                System.out.println("Consonant");
                break;
        }
    }
}
