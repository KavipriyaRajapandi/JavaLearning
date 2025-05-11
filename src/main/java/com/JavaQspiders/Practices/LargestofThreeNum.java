package com.JavaQspiders.Practices;

import java.util.Scanner;

public class LargestofThreeNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first Input:");
    int a = sc.nextInt();
    System.out.println("Enter the second Input:");
    int b = sc.nextInt();
    System.out.println("Enter the third Input:");
    int c = sc.nextInt();

    if (a > b && a > c) {
      System.out.println("A is greater than B and C, So A value is " + a);
    } else if (b > a && b > c) {
      System.out.println("B is greater than A and C,So B value is " + b);
    } else if (c > a && c > b) {
      System.out.println("C is greater than A and B");
    } else if (a == b && a > c && b > c) {
      System.out.println("A,B is greater than C");
    } else if (b == c && b > a && c > a) {
      System.out.println("B,C is greater than A");
    } else if (a == c && a > b && c > b) {
      System.out.println("A,C GREATER THAN B");
    } else if (a == b && b == c && c == a) {
      System.out.println("A,B AND C ARE ALL EQUAL,So comman value is" + a);
    } else {
      System.out.println("C is greater than A and B,So C value is " + c);
    }

  }

}
