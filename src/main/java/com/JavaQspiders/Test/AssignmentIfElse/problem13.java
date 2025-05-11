package com.JavaQspiders.Test.AssignmentIfElse;

import java.util.Scanner;

public class problem13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age");
    int age = sc.nextInt();

    if (age >= 18) {
      System.out.println(age + " is valid for voting");
    } else {
      System.out.println("Not valid for voting");
    }

  }

}
