package com.JavaQspiders.Test.AssignmentIfElse;

// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

class problem9 {

  public static void main(String[] var0) {
    Scanner var1 = new Scanner(System.in);
    System.out.println("Program Starts.....");
    System.out.println("Enter the Number:");
    int var2 = var1.nextInt();
    if (var2 == 0) {
      System.out.println("Zero");
    } else if (var2 > 0) {
      System.out.println("Positive");
    } else {
      System.out.println("Negative");
    }

    System.out.println("Program Ends.");
  }
}
