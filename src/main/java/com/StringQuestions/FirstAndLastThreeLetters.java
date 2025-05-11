package com.StringQuestions;

import java.util.Scanner;

public class FirstAndLastThreeLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the STRING:");
        String str = sc.nextLine();
        System.out.println("Enter the N number");
        int N = sc.nextInt();

        //System.out.println(str.substring(0,3));
        //System.out.println(str.substring(0,N)); // to get firsT N letters
        //System.out.println(str.substring(str.length()-3)); //To get last 3 letter
        System.out.println(str.substring(str.length()-N)); //to get last N letters
    }
}
