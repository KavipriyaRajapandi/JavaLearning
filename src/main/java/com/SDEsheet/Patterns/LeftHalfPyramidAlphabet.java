package com.SDEsheet.Patterns;

public class LeftHalfPyramidAlphabet {
    public static void main(String[] args) {
        int n = 5;
        char ch;

        for (int i = 0; i < n; i++) {
            ch = 'A';
            for (int j = 0; j < n; j++) {
                if(i+j<=n-1){
                    System.out.print(ch++ +" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
