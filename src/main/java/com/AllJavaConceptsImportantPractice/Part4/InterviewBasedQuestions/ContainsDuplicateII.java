package com.AllJavaConceptsImportantPractice.Part4.InterviewBasedQuestions;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] num = {1,2,3,1,2,3};
        int k= 2;
        boolean ans = solve(num,k);
        if(ans){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static boolean solve(int[] a,int k){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j] && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
    }
}
