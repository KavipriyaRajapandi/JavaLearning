package com.SDEsheet.Patterns;

public class AllHalfPyramid {
    public static void main(String[] args) {
            int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j<=n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            //System.out.println();
            for (int j = 0; j < n; j++) {
                if(i<=j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>=j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            //System.out.println();
            for (int j = 0; j < n; j++) {
                if(i+j>=n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
