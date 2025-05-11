package com.Practice.ArrayTest;

import java.util.*;
public class Part2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = {8,7,2,3,1,6};
        int[] b = {5,0,1,6,2};
        int[] c = {2,4,6,8,10};
        int[] d = {4,2,-6,5,-3};
        int[] e = {8,4,8,1,2,0,1,7,9,8,8};
        int[] nums = {1, 8, 0, 1, 7, 2, 0, 6, 3, 1, 4};
        /*
        System.out.print("Enter the Target:");
        int target = sc.nextInt();
        target2sum(a,target);
        */

        //missingNumberInArray(b);
        //printOrderOfSubArray(c);
        //maximumSumOfSubArray(d);
        //maximumSumOfSubArrayApproach2(d);
        //maximumSumOfSubArrayApproach3(d);
        //removeDuplicatesInArray(e);
        //printDuplicatesInArray(e);

        System.out.print("Enter the Target:");
        int target = sc.nextInt();
        target3Sum(nums,target);

    }
    public static void target2sum(int[]a,int target){
        Arrays.sort(a);
        //{1,2,3,6,7,8}
        int left = 0;
        int right = a.length-1;
        while(left<right){
            int sum = a[left] + a[right];
            if(sum==target){
                System.out.println(a[left]+","+a[right]);
                left++;
                right--;
            }
            if(sum<target){
                left++;
            }
            if(sum>target){
                right--;
            }
        }
    }

    public static void missingNumberInArray(int[] b){
        Arrays.sort(b);
        int count = 0;
        //0 1 2 5 6
        for(int i=0;i<b.length;i++,count++){
            if(b[i]!=count){
                System.out.print(count+" ");
                i--;
            }
        }
    }

    public static void printOrderOfSubArray(int[] c){
        for(int i=0;i<c.length;i++){
            int start = i;
            for(int j=i;j<c.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(c[k]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void maximumSumOfSubArray(int[] d){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<d.length;i++){
            for(int j=i;j<d.length;j++){
                sum = 0;
                for(int k=i;k<=j;k++){
                    sum += d[k];
                    if(sum>max){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static void maximumSumOfSubArrayApproach2(int[] d){
        int[] p = new int[d.length];
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<p.length;i++){
            p[i] = d[i];
            for(int j=i+1;j<p.length;j++){
                p[j] = p[j-1] + d[j];
                if(p[j]>max){
                    max = p[j];
                }
            }
        }
        System.out.println(max);
    }

    public static void maximumSumOfSubArrayApproach3(int[] d){
        int max_so_far = d[0];
        int max_ending_here = d[0];
        for(int i=1;i<d.length;i++){
            max_ending_here = Math.max(max_ending_here+d[i],d[i]);
            max_so_far = Math.max(max_ending_here,max_so_far);
        }
        System.out.print(max_so_far);
    }

    public static void removeDuplicatesInArray(int[] e){
        //sort the array8,4,8,1,2,0,1,7,9,8,8
        //0,1,1,2,4,7,8,8,8,8,9
        Arrays.sort(e);
        for(int i=0;i<e.length-1;i++){
            if(e[i]!=e[i+1]){
                System.out.print(e[i]+" ");
            }
        }
        if(e[e.length-1]!=e[e.length-2]){
            System.out.print(e[e.length-1]+" ");
        }
    }

    public static void printDuplicatesInArray(int[] e){
        Arrays.sort(e);
        boolean[] seen = new boolean[255];
        for(int i=0;i<e.length-1;i++){
            if(e[i]==e[i+1]){
                seen[e[i]] = true;
            }
        }
        if(e[e.length-1]==e[e.length-2]){
            seen[e[e.length-1]] = true;
        }

        for(int i=0;i<e.length;i++){
            if(seen[e[i]]==true){
                System.out.print(e[i]+" ");
                seen[e[i]]= false;
            }
        }
    }

    public static void target3Sum(int[] nums,int target){
        Arrays.sort(nums);
        //int[] nums = {1, 8, 0, 1, 7, 2, 0, 6, 3, 1, 4};
        //{0,0,1,1,1,2,3,4,6,7,8}
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];

                if(sum==target){
                    System.out.println(nums[i]+","+nums[left]+","+nums[right]);
                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
    }
}
