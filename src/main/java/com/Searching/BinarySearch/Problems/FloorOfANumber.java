package com.Searching.BinarySearch.Problems;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3 , 5, 9,14,16,18};
        int ans = floorOfaNumber(arr,15);
        System.out.println(ans);

    }

    static int floorOfaNumber(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/ 2;

            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
