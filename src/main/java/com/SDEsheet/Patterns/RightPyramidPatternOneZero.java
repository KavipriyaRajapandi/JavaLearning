package com.SDEsheet.Patterns;

public class RightPyramidPatternOneZero {
    public static void main(String[] args) {
        int n = 5;
        int start;

        for (int i = 0; i < n; i++) {
            if(i%2==0) start = 1;
            else start = 0;
            for (int j = 0; i>=j; j++) {
                if(true){
                    System.out.print(start+" ");
                }
                else{
                    System.out.print("  ");
                }
                start = 1 - start;

            }
            System.out.println();

        }
    }
}
