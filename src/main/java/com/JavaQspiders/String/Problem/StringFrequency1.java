package com.JavaQspiders.String.Problem;

public class StringFrequency1 {
    public static void main(String[] args) {
        String s = "hello";
        char[] a = s.toCharArray();
        String ans = "";
        int count = 1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count++;
            }
            else{
                ans = a[i] +""+":"+count;
                System.out.println(ans);
                count=1;
            }

        }
        ans = a[a.length-1] + ""+":"+count;
        System.out.println(ans);
        //it will work but for input : helloh it wont count h as two.
    }
}
