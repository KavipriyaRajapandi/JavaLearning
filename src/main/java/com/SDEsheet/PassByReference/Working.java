package com.SDEsheet.PassByReference;

public class Working {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        passbyreference(a);
        System.out.println(a[0]);
    }
    public static void passbyreference(int[] arr){
        arr[0] += 100;
        System.out.println(arr[0]);
    }
}
