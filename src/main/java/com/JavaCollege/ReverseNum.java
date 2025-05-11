package com.JavaCollege;

public class ReverseNum {
    public static void main(String[] args) {

        int num = 654321;

        int ans = 0;

        while(num > 0){
            int rem = num % 10; // 4
            num /= 10; // 123
            ans = ans * 10 + rem; //0 *10 + 4 = 4
        }
        System.out.println(ans);
    }
}
