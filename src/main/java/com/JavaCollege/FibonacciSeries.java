package com.JavaCollege;

public class FibonacciSeries {
    public static void main(String[] args) {

        long i = 1, n = 10, t1 = 0, t2 = 1;
        System.out.println("Fibonacci Series of " + n + " terms:");

//        while (i <= n) {
//            System.out.print(t1 + ", ");
//
//            long sum = t1 + t2;
//            t1 = t2;
//            t2 = sum;
//
//            i++;
//        }
        for(i = 1;i<=n-2;i++){
            long t3 = t1+t2; // 1
            System.out.println(t3+" ");
            t1 = t2; // 1
            t2 = t3; // 1
        }
    }
}
