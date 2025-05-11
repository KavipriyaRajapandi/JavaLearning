package com.JavaQspiders.ArrayConcepts.Programs.Assignment.TwoPointers;

class DifferentInputForTwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 8, 0, 1, 7, 2, 0, 6, 3, 1, 4};
        int target = 10;

        solve(nums,target);
    }
    public static void solve(int[] a,int target){
        boolean[] visited = new boolean[255];

        for(int i=0;i<a.length;i++){
            int complement = target - a[i];

            if(complement>=0 && visited[complement]){
                System.out.println(a[i]+","+complement);
            }
            visited[a[i]] = true;
        }
    }
}
