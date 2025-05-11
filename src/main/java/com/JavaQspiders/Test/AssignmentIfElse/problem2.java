package com.JavaQspiders.Test.AssignmentIfElse;

import java.util.*;

public class problem2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the First input");
    int a = sc.nextInt();
    System.out.println("Enter the second input:");
    int b = sc.nextInt();
    System.out.println("Enter the third input:");
    int c = sc.nextInt();

    if (a < b && a < c) {
      System.out.println(a + " - A is smaller than B and C");
    }
    if (b < a && b < c) {
      System.out.println(b + " - B is smaller than A and C");
    } else {
      System.out.println(c + " - C is smaller than A and B");
    }
  }
}
