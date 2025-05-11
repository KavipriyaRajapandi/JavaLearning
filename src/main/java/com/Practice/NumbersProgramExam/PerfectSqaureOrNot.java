package com.Practice.NumbersProgramExam;

import java.util.Scanner;

public class PerfectSqaureOrNot {
    //later study it in binary search
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

//        int root = (int) Math.sqrt(num);
//        if(root*root==num){
//            System.out.println("Perfect Square");
//        }
//        else{
//            System.out.println("Not a Perfect Square");
//        }
        if(Math.sqrt(num)%1==0){
            System.out.println("Perfect Square");

        }
        else{
            System.out.println("Not a Perfect Sqaure");
        }

    }
}
