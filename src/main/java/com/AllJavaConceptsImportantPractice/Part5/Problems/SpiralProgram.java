package com.AllJavaConceptsImportantPractice.Part5.Problems;

public class SpiralProgram {
    public static void main(String[] args) {
        int [][] a = {
                {1,2,3,4,5},
                {16,17,18,19,6},
                {15,24,25,20,7},
                {14,23,22,21,8},
                {13,12,11,10,9}
        };
        int left = 0;
        int right = a.length-1;
        int top = 0;
        int bottom = a.length-1;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");
            }
            top++;
            System.out.println();
            for(int i=top;i<=bottom;i++){
                System.out.print(a[i][right]+" ");
            }
            right--;
            System.out.println();
            for(int i=right;i>=left;i--){
                System.out.print(a[bottom][i]+" ");
            }
            bottom--;
            System.out.println();
            for(int i=bottom;i>=top;i--){
                System.out.print(a[i][left]+" ");
            }
            left++;
        }
    }
}
