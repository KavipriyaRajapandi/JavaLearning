package com.JavaCollege;

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EmpId = sc.nextInt();
        String Department = sc.nextLine();

        switch (EmpId) {
            case 1 -> System.out.println("Sibi Varshaan");
            case 2 -> System.out.println("Kunal");
            case 3 -> {
                System.out.println("Emp No 3");
                switch (Department) {
                    case "IT" -> System.out.println("IT Department");
                    case "CSE" -> System.out.println("Cse Department");
                    default -> System.out.println("Some other Department");
                }
            }
            default -> System.out.println("Employee Not Available");
        }
    }
}
