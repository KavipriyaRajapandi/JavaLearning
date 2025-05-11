package com.AllJavaConceptsImportantPractice.Part4.Programs;

public class DifferentInputFindTargetSum2EffectiveApproach {
    public static void main(String[] args) {
        int[] a = {8,7,2,3,1,6};
        int target = 10;
        solve(a,target);
    }
    public static void solve(int[]a,int target){
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
