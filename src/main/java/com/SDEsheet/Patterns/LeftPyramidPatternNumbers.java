package com.SDEsheet.Patterns;

public class LeftPyramidPatternNumbers {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j>=n-1){
                    System.out.print(n-j+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
