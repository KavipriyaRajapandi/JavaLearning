package com.Searching.LinearSearch;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3},
            {7,5},
            {7,3}
            };

        System.out.println(maximumWealth(arr));

    }
    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for(int acc = 0;acc < accounts[person].length;acc++){
                sum = sum + accounts[person][acc];
            }
            if(ans < sum){
                ans = sum;
            }
        }
        return ans;
    }

}
