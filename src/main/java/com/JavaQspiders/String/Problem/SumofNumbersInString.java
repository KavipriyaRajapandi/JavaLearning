package com.JavaQspiders.String.Problem;

/*
Input : "S2y3e61d"
Ouput : 2 + 3 + 6 + 1 = 12
 */

public class SumofNumbersInString {
    public static void main(String[] args) {
        String a = "S2y3e61d";

        char[] res = a.toCharArray();
        int sum = 0;

        for(int i=0;i<res.length;i++){
            if(res[i]>='1' && res[i]<='9'){
                sum += res[i] - 48;
            }
        }

        System.out.println(sum);


    }
}
