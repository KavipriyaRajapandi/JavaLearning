package com.AllJavaConceptsImportantPractice.Part3.Methods.Programs;

import java.util.Scanner;

public class FindLargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number:");
        int c = sc.nextInt();

        int res = largest(a,b,c);
        if(res==0){
            System.out.println("All the Values are same");
        }
        else{
            System.out.println("Largest number is "+res);
        }
    }
    public static int largest(int a,int b,int c){
        int largestNumber=0;
        if(a==b && b==c){
            return 0;
        }
        else if(a>b && a>c){
            largestNumber = a;
        }
        else if(b>c && b>a){
            largestNumber = b;
        }
        else if(c>a && c>b){
            largestNumber = c;
        }
        return largestNumber;
    }
}
