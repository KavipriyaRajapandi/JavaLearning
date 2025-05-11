package com.SDEsheet.Patterns;

public class ReverseLeftHalfPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; i+j<=n-1; j++) {
                if(true){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
