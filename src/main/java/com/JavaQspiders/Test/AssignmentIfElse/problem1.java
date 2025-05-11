package com.JavaQspiders.Test.AssignmentIfElse;

import java.util.Scanner;

class problem1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the First input");
    int a = sc.nextInt();
    System.out.println("Enter the second input:");
    int b = sc.nextInt();

    if (a < b) {
      System.out.println(a + " - A is smaller than B");
    } else {
      System.out.println(b + " - B is smaller than A");
    }
  }

}
