package com.AllJavaConceptsImportantPractice.Part4.Programs;

public class AddEvenElementsInArray {
    public static void main(String[] args) {
        int [] a = {6,4,3,2,1,7};

        int res = solve(a);
        System.out.print("Sum of Even Elements is "+res);
    }
    public static int solve(int[] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                sum += a[i];
            }
        }
        return sum;
    }
}
