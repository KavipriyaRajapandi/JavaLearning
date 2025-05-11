package com.JavaQspiders.Test.AssignmentIfElse;

import java.util.Scanner;

public class problem10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character: ");
    char ch = sc.next().charAt(0);

    if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        || (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
      System.out.println(ch + " is a Vowel");
    } else {
      System.out.println(ch + " is a consonant");
    }

  }

}
