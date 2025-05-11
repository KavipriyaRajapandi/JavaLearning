package com.JavaQspiders.Test.AssignmentIfElse;

import java.util.Scanner;

public class problem3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value to divide");
    int inp = sc.nextInt();

    if (inp % 3 == 0) {
      System.out.println(inp + " is divisible by 3");
    } else {
      System.out.println(inp + "is not divisible by 3");
    }

  }

}
