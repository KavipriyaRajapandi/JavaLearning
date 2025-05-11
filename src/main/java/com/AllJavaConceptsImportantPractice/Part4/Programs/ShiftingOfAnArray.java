package com.AllJavaConceptsImportantPractice.Part4.Programs;
import java.util.*;
public class ShiftingOfAnArray {

        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args){
            int[] a = {2,3,4,1,7};
            System.out.println(Arrays.toString(a));
            System.out.println("Enter how many shifting Needed:");
            int shift = sc.nextInt();

            int[] res = shifting(a,shift);

            System.out.println(Arrays.toString(res));
        }
        public static int[] shifting(int[] a,int s){
            for(int m=1;m<=s;m++){
                int start= a[0];
                for(int i=0;i<a.length-1;i++){
                    a[i] = a[i+1];
                }
                a[a.length-1] = start;
            }

            return a;
        }
}
