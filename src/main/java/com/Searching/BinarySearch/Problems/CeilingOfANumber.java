package com.Searching.BinarySearch.Problems;

public class CeilingOfANumber {



    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16,18};
        int[] arr2 = {18, 16, 14, 9, 5, 3, 2};
        int ans2 = ceilingNumber(arr2,4);
        System.out.println(ans2);

        int ans = ceilingNumber(arr, 15);
        //System.out.println(ans);

    }

    static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;


            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return arr[end];
    }

}
