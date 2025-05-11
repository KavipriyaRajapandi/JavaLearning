package com.Practice.NumbersProgramExam;
// 0 1 1 2 3 5 8 13 21 34
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms want to write:");

        int n= sc.nextInt();
        int t1 = 0; //1
        int t2 = 1; // 1
        int sum = 0;

        for(int i=0;i<n;i++) {
            sum = t1 + t2;
            System.out.print(t1+",");
            t1 = t2;
            t2 = sum;
        }
    }
}
