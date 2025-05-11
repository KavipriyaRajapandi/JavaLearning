package com.AllJavaConceptsImportantPractice.Part4.Programs;

public class PrintSubArrayPattern {
    public static void main(String[] args) {
        int[] a = {4,2,-6,5,-3};
        printsubArray(a);
    }
    public static void printsubArray(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.print("\t\t");
            }
            System.out.println();
        }
    }
}
