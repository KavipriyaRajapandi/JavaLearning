package com.JavaQspiders.Test.AssignmentIfElse;

import java.util.Scanner;

public class else_if1 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the input:");

    System.out.println("Harsha,Keerthana - 1");
    System.out.println("Shambu,Nandini - 2");
    System.out.println("Nagaraj,Bharath - 3");

    System.out.println("\t\t\tProcessing....");
    Thread.sleep(1000);

    int ip = sc.nextInt();

    if (ip == 1) {
      System.out.println("o/p Testing");
    }

    else if (ip == 2) {
      System.out.println("o/p Java");
    }

    else if (ip == 3) {
      System.out.println("o/p SQL");
    }

    else {
      System.out.println("Invalid input");
    }

  }

}
