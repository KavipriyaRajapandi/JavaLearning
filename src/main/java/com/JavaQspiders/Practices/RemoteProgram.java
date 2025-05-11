package com.JavaQspiders.Practices;// SELECT THE INPUT
//1.POWER ON
//2.POWER OFF
import java.util.Scanner;
class RemoteProgram{
  public static void main(String[] args)throws Exception{
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Input");
    int input = sc.nextInt();
    
   
    if(input ==  1){
      System.out.println("Processing");
      Thread.sleep(1000);
      System.out.println("Power on");
    }

    else if(input == 2){
      System.out.println("Processing");
      Thread.sleep(1000);
      System.out.println("Power off");
    }
    else{
      System.out.println("Processing");
      Thread.sleep(1000);
      System.out.println("Invalid");
    }
  }
}
