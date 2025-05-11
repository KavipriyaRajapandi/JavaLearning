package com.SDEsheet.Patterns;

public class RightHalfPyramidColumnsNumberPlus1 {
    public static void main(String[] args) {
        int n= 5;

        for (int i = 0; i <n; i++) {
            for (int j = 0; i>=j; j++) {
                if(true){
                    System.out.print(j+1+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
