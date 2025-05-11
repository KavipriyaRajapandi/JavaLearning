package com.JavaCollege;

public class CountNum {
    public static void main(String[] args) {
        int n = 233563453;
        int count = 0;

        while(n > 0) {
            int rem = n % 10; // going to give the remainder of the  given n which is last digit
            if (rem == 3) {
                count++;
            }
            n/=10; // going to return the remaining digits
        }
        System.out.println(count);

    }
}
