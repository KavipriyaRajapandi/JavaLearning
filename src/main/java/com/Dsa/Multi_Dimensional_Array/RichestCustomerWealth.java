package com.Dsa.Multi_Dimensional_Array;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{3,2,1}};

        int max = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            int sum = 0;
            for(int j=0;j<a[i].length;j++){
                sum += a[i][j];
                if(sum>max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
