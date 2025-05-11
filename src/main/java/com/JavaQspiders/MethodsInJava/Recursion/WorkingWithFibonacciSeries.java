package com.JavaQspiders.MethodsInJava.Recursion;

import java.util.Scanner;

public class WorkingWithFibonacciSeries {
    static Scanner sc = new Scanner(System.in);
    static int temp1=0;
    static int temp2=1;
    static int res;


    public static void main(String[] args) {
        System.out.println("Enter the Terms:");
        int terms = sc.nextInt();

        int res = fibseries(terms);
        System.out.print(res);

    }
    public static int fibseries(int terms){
        if(terms>=0) {
            res = temp1 + temp2;
            System.out.print(temp1+",");
            temp1 = temp2;
            temp2 = res;
            terms--;
            fibseries(terms);
        }
return temp1;
    }
}
