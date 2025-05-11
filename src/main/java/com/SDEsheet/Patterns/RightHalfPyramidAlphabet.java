package com.SDEsheet.Patterns;

public class RightHalfPyramidAlphabet {
    public static void main(String[] args) {
        int n = 5;
        char ch;

        for(int i=0;i<n;i++){
            ch = 'A';
            for (int j = 0; j < n; j++) {
                if(i>=j){
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
