package com.Dsa.Arrays;

public class No_of_Good_Pairs {
    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,3};
        int count = 0;

        for(int i=0;i<a.length;i++){
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]==a[j] && i<j){
                    count++;
                }
            }
        }

        System.out.println("Good pairs:"+count);
    }
}
