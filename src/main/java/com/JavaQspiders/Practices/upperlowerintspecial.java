package com.JavaQspiders.Practices;

import java.util.Scanner;

public class upperlowerintspecial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character");
    char ch = sc.next().trim().charAt(0);

    if (ch >= 'a' && ch <= 'z') {
      System.out.println(ch + " is an LOWERCASE");
    } else if (ch >= 'A' && ch <= 'Z') {
      System.out.println(ch + " is an UPPERCASE");
    } else if (ch >= '0' && ch <= '9') {
      System.out.println("Integer");
    } else {
      System.out.println("SPECIAL CHARACTER");
    }

  }

}
