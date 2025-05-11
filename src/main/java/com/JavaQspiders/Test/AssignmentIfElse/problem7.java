package com.JavaQspiders.Test.AssignmentIfElse;

import java.util.*;

public class problem7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year as input: ");
    int y = sc.nextInt();
    boolean leap = false;
    // divisible by 4 then leap year
    if (y % 4 == 0) {
      // divisible by 100 if the year ends with 00
      if (y % 100 == 0) {
        if (y % 400 == 0) {
          leap = true;
        } else {
          leap = false;
        }
      } else {
        leap = true;
      }
    } else {
      leap = false;
    }
    if (leap) {
      System.out.println("This year is leap year -" + y);
    } else {
      System.out.println("This year is not leap year -" + y);
    }
  }
}
