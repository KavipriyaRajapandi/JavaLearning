package com.JavaQspiders.Practices;

import java.util.Scanner;

class OddEvenZero{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Program Starts.....");
    System.out.println("Enter the Number:");
    int inp = sc.nextInt();

    if(inp == 0){
      System.out.println("Zero");
    }
    else{
      if(inp % 2 == 0){
        System.out.println("Even");
      }
      else{
        System.out.println("Odd");
      }
    }
    System.out.println("Program Ends.");
  }
}
