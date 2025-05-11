package com.SelfLearningJava;

import java.util.Scanner;

public class countingOccurences {
    // 1 2 3 7 8 3 7 9 3 9 3 3 9 8
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long count = 0;
        System.out.println("ENTER THE WANTER OCC NUMBER:");
        long a = sc.nextLong(); // 3
        System.out.println("OCCURENCE NUMBER:");
        long n = sc.nextLong(); // 1 7 8 3 5 3 6 3 1 4 3 3 7 3

        System.out.println("count of occurance:");
        while (n > 0) {
            long rem = n % 10;
            if (rem == a) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}

