package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

public class AutoMorphicOriginal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        long num = sc.nextLong();

        if(automorphicNumber(num)){
            System.out.println("AutoMorphic Number");
        }
        else{
            System.out.println("Not an AutoMorphic number");
        }
    }
    public static boolean automorphicNumber(long num){
        long square = num*num;

        while(num>0){

            if(num%10 != square%10){
                return false;
            }
            num /=10;
            square/=10;
        }
        return true;
    }
}
