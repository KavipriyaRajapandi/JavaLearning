package com.AllJavaConceptsImportantPractice.Part2.PatternProgram;
import java.util.Scanner;
public class Program3SequenceOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattern:");
        int n = sc.nextInt();
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>=j){
                    System.out.print(++k+"\t");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
