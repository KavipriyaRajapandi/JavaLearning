package com.JavaQspiders.Practices;

import java.util.Scanner;

class TraingleProblem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the sides of the triangle
    System.out.println("Enter the length of the first side: ");
    int side1 = scanner.nextInt();

    System.out.println("Enter the length of the second side: ");
    int side2 = scanner.nextInt();

    System.out.println("Enter the length of the third side: ");
    int side3 = scanner.nextInt();

    // Check if the inputs form a valid triangle
    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
      // Determine the type of triangle
      if (side1 == side2 && side2 == side3) {
        System.out.println("The triangle is Equilateral.");
      } else if (side1 == side2 || side2 == side3 || side1 == side3) {
        System.out.println("The triangle is Isosceles.");
      } else {
        System.out.println("The triangle is Scalene.");
      }
    } else {
      System.out.println("The given sides do not form a valid triangle.");
    }
  }
}
