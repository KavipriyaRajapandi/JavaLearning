package com.SDEsheet.Patterns;

public class RightHalfPyramidRowNumber {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; i>=j; j++) {
                if(true){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
