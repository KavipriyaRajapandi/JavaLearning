package com.JavaQspiders.Practices;

import java.util.Scanner;

class if_else_prob1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Program Starts.....");
    System.out.println("Enter the Number:");
    int inp = sc.nextInt();

    if(inp % 6 == 0){
      System.out.println("Divisible by 6");
    }
    else{
      System.out.println("Not Divisible by 6");
    }

    System.out.println("Program Ends.");

  }
}

