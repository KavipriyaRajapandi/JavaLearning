package com.JavaQspiders.Practices;

import java.util.Scanner;

class MaxTwoNum{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first Input:");
    int a = sc.nextInt();
    System.out.println("Enter the second Input:");
    int b = sc.nextInt();

    if(a > b){
      System.out.println("A is greater than B, So A value is "+a);
    }
    else{
      System.out.println("B is greater than A,So B value is "+b);
    }


  }
}
