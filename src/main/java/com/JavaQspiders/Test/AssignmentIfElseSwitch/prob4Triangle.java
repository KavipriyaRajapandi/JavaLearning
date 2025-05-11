package com.JavaQspiders.Test.AssignmentIfElseSwitch;

import java.util.Scanner;

/*
Explanation:
Input:

The program uses Scanner to take input for the three angles.
Validation:

It checks if all angles are positive.
It ensures the sum of the three angles is exactly 180°.
Output:

If both conditions are true, it prints "The triangle is valid."
Otherwise, it prints "The triangle is not valid."
 */

public class prob4Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle");
        int angle1 = sc.nextInt();
        System.out.println("Enter the second angle");
        int angle2 = sc.nextInt();
        System.out.println("Enter the third angle");
        int angle3 = sc.nextInt();

        if(angle1 > 0 && angle2 > 0 && angle3 > 0 && (angle1 + angle2 + angle3 == 180)){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Not Valid");
        }
    }
}
