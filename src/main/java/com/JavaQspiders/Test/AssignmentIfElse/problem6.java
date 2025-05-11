package com.JavaQspiders.Test.AssignmentIfElse;

import java.util.Scanner;

public class problem6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value to divide");
    int inp = sc.nextInt();

    if (inp % 2 == 0) {
      System.out.println(inp + " is Even");
    } else {
      System.out.println(inp + " is Odd");
    }

  }

}
