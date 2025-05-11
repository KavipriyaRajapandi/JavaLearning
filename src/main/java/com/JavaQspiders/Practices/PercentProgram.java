package com.JavaQspiders.Practices;

import java.util.Scanner;

class PercentProgram {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the percentage:");
    double per = sc.nextDouble();

    if(per >= 90.0){
      System.out.println(per +" is Grade A");
    }
    if(per < 40){
      System.out.println(per +" is Fail");
    }
  }
}
