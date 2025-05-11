package com.Dsa.Arrays;

public class Find_Numbers_With_Even_Numbers_Of_Digits {
    public static void main(String[] args) {
        int[] a = {12,345,2,6,7896};
        int count = 0;

        for(int i=0;i<a.length;i++){
            if(isEven(a[i])){
                count++;
            }
        }
        System.out.println("Even Number Digits in array is:"+count);
    }
    public static boolean isEven(int num){
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }

        if(count%2==0){
            return true;
        }
        return false;
    }
}
