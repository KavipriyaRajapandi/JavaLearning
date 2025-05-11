package com.JavaQspiders.Practices;

import java.util.Scanner;

public class switch1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int ip = sc.nextInt();

    switch (ip) {
      case 1: {
        System.out.println("Pushpa");
        System.out.println("                 ");
        String o = ("1.Allu Arjun\n2.Rashmika");
        System.out.println(o);
        System.out.println("Actors age need input 1 or 2");
        int i = sc.nextInt();

        switch (i) {
          case 1:
            System.out.println("Allu arjun age is 35");

            break;

          case 2:
            System.out.println("Rashmika age is 28");
            break;

          default:
            System.out.println("Invalid Actor");
            break;
        }
      }
        break;
      case 2: {
        System.out.println("Vikram");
        System.out.println("                 ");
        String k = ("1.Kamal hassan\n2.Vijay Sethupathy");
        System.out.println(k);
        System.out.println("Actors age need input 1 or 2");
        int v = sc.nextInt();

        switch (v) {
          case 1:
            System.out.println("Kamal age is 70");

            break;

          case 2:
            System.out.println("Vijay sethupathi age is 50");
            break;

          default:
            System.out.println("Invalid Actor");
            break;
        }
      }
        break;
      case 3: {
        System.out.println("Leo");
        System.out.println("                 ");
        String w = ("1.Vijay\n2.Trisha");
        System.out.println(w);
        System.out.println("Actors age need input 1 or 2");
        int p = sc.nextInt();
        switch (p) {
          case 1:
            System.out.println("Vijay age is 50");

            break;

          case 2:
            System.out.println("Trisha age is 43");
            break;

          default:
            System.out.println("Invalid Actor");
            break;
        }
      }
        break;
      case 4: {
        System.out.println("Invalid Movie selection");
        break;
      }
    }

  }

}
