package com.SDEsheet.Patterns;

public class RightHalfPyramidReverseAlphabet {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E'-i); ch <= 'E'; ch++) {
                if(true){
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
