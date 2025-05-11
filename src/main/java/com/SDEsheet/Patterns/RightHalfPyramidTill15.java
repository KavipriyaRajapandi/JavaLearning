package com.SDEsheet.Patterns;

public class RightHalfPyramidTill15 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>=j){
                    System.out.print(num++ +" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
    }
}
