package com.JavaQspiders.Practices;

import java.util.Scanner;

class if_else_prob2{
  

  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Input:");
    int inp = sc.nextInt();

    if(inp % 3 == 0 && inp % 9 == 0){
      System.out.println(inp+"is divisible by 3 and 9");
    }
    
    else{
      if(inp % 3 == 0){
      System.out.println(inp+"is divisible by 3");
    }
    else{
      System.out.println(inp+"is not Divisible");
    }
    }
  }
}
