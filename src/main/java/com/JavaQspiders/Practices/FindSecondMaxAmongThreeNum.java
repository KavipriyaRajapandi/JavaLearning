package com.JavaQspiders.Practices;

import java.util.Scanner;

public class FindSecondMaxAmongThreeNum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first Input:");
    int a = sc.nextInt();
    System.out.println("Enter the second Input:");
    int b = sc.nextInt();
    System.out.println("Enter the third Input:");
    int c = sc.nextInt();

    if (a > b && a > c) {
      if (b > c) {
        System.out.println("B is Second largest value");
      } else {
        System.out.println("C is second largest value");
      }
    } else if (b > a && b > c) {
      if (a > c) {
        System.out.println("A  is second largest value");
      } else {
        System.out.println("C is second largest value");
      }
    } else if (c > a && c > b) {
      if (c > b) {
        System.out.println("C  is second largest value");
      } else {
        System.out.println("B is second largest value");
      }

    } else {
      System.out.println("Invalid");
    }

  }

}
