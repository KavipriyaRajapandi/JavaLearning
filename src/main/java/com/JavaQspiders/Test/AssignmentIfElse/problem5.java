package com.JavaQspiders.Test.AssignmentIfElse;

import java.util.Scanner;

public class problem5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value to divide");
    int inp = sc.nextInt();

    if (inp % 11 == 0) {
      System.out.println(inp + " is divisible by 11");
    } else {
      System.out.println(inp + " is not divisible by 11");
    }

  }

}
