package com.AllJavaConceptsImportantPractice.Part5.Problems;

public class BookProgram {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{1},{1,2,3,4},{1,2,3,4,5,6}};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            max = maxBook(a[i],max);
            min = minBook(a[i],min);
        }

        System.out.println("Maximum page book is "+max);
        System.out.println("Minimum page book is "+min);

    }

    public static int minBook(int[] a, int min) {
        int n = a.length;
        if(min>n){
            min = n;
        }
        return min;
    }

    public static int maxBook(int[] a,int max){
        int n = a.length;
        if(max<n){
            max = n;
        }
        return max;
    }
}
