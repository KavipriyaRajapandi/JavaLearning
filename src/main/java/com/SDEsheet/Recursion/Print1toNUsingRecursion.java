package com.SDEsheet.Recursion;

import java.util.Scanner;

public class Print1toNUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N Value:");
        int n = sc.nextInt();
        int temp = 1;

        print1toN(n,temp);
    }
    public static void print1toN(int n,int temp){

        if(n>0){
            System.out.println(temp);
            temp++;
            n--;
            print1toN(n,temp);
        }
    }
}
