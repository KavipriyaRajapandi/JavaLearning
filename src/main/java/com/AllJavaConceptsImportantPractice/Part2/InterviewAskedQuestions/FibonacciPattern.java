package com.AllJavaConceptsImportantPractice.Part2.InterviewAskedQuestions;
/*
 0
 1 1
 2 3 5
 */
public class FibonacciPattern {
    public static void main(String[] args) {
        int n = 3;
        int t1 = 0;
        int t2 = 1;
        int t3 = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>=j){
                    System.out.print(t1+" ");
                    t3 = t1+ t2;
                    t1 = t2;
                    t2 = t3;
                }
            }
            System.out.println();
        }
    }
}
