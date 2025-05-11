package com.JavaQspiders.Test.AssignmentForLoop;

import java.util.Scanner;

public class numberFrom1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
    }
}
