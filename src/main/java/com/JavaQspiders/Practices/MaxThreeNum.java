package com.JavaQspiders.Practices;

import java.util.Scanner;

class MaxThreeNum{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first Input:");
    int a = sc.nextInt();
    System.out.println("Enter the second Input:");
    int b = sc.nextInt();
    System.out.println("Enter the third Input:");
    int c = sc.nextInt();

    if(a > b && a > c){
      System.out.println("A is greater than B and C, So A value is "+a);
    }
    if(b > a && b > c){
       System.out.println("B is greater than A and C,So B value is "+b);
    }
    if(a == b || b == a || a > c || b > c || c > a || c > b){
      System.out.println("C is greater than A and B");
    }
    if(a == b || b == a || a > c || b > c){
      System.out.println("A,B is greater than C");
    }
    if(a==b && b == c && c == a){
      System.out.println("A,B AND C ARE ALL EQUAL,So comman value is"+a);
    }
    else{
      System.out.println("C is greater than A and B,So C value is "+c);
    }



  }
}
