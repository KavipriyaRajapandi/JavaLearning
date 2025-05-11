package com.SDEsheet.Patterns;

public class RightPyramidTriangleColumns {
    public static void main(String[] args) {
        int n = 3;
        char ch;

        for (int i = 0; i < n; i++) {
            ch = 'C';
            for (int j = 0; j < n; j++) {
                if(i>=j){
                    System.out.print(ch--+" ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
