package com.AllJavaConceptsImportantPractice.Part5.Problems;

public class RotationProgramUsingMultiDimensionalArrays {
    public static void main(String[] args) {
        int [][] a = {
                {1,2,3,4},
                {1,2,3},
                {1,2,3,4,5},
                {1,2,3,4,5,6}
        };
        for(int i=0;i<a.length;i++){
            System.out.println();
            rotationProgram(a[i],i);
        }
    }
    public static void rotationProgram(int[] arr,int k){
        for(int m=0;m<k;m++){
            int start = arr[0];
            for (int i = 0; i <arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = start;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
