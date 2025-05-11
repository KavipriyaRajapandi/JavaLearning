package com.JavaQspiders.Test.AssignmentIfElse;

import java.util.Scanner;

public class problem11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the input: ");
    int ip = sc.nextInt();

    if (ip == 1) {
      System.out.println("Monday is a Week-day");
    }
    if (ip == 2) {
      System.out.println("Tuesday is a Week-day");
    }
    if (ip == 3) {
      System.out.println("Wednesday is a Week-day");
    }
    if (ip == 4) {
      System.out.println("Thursday is a Week-day");
    }
    if (ip == 5) {
      System.out.println("Friday is a Week-day");
    }
    if (ip == 6) {
      System.out.println("It is a week-end");
    }
    if (ip == 7) {
      System.out.println("It is a week-end");
    } else {
      System.out.println("Invalid data");
    }
  }

}
