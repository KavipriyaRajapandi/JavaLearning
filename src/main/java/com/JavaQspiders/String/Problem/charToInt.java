package com.JavaQspiders.String.Problem;

public class charToInt {
    public static void main(String[] args) {
        char[] a = {'0','1','2','3','4','5','6','7','8','9'};
        for(int i=0;i<a.length;i++){
            int index = a[i] - '0';
            System.out.println(index+" ");
        }
    }
}
