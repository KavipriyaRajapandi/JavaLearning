package com.JavaQspiders.String.Problem;

import java.util.Arrays;

/*
Input: aceADBbZY
Output: abcABDeYZ
 */
public class StringCapitalSmall1 {
    public static void main(String[] args) {
        String s = "aceADBbZY";
        char[] r = s.toCharArray();
        char[] b = sorting(r);

        String res = "";
        String uc = "";
        String lc = "";

        for(int i=0;i<b.length;i++){
            if(b[i]>='a' && b[i]<='z'){
                lc += b[i];
            }
            else{
                uc += b[i];
            }
        }
        char[] v = new char[r.length];
        char[] u = uc.toCharArray();
        char[] l = lc.toCharArray();
        int x = 0;
        int y = 0;

        for(int i=0;i<s.length();i++){
            if(r[i]>='a' && r[i]<='z'){
                v[i] = l[x];
                x++;
            }
            else{
                v[i] = u[y];
                y++;
            }
        }
        res = new String(v);
        System.out.println(res);

    }
    public static char[] sorting(char [] r){
        int[] a = new int[r.length];
        for(int i=0;i<r.length;i++){
            a[i] = (char) r[i];
        }
        char[] b = mergesort(a);
        return b;
    }
    public static char[] mergesort(int[] arr){
        divide(0,arr.length-1,arr);
        char[] a = new char[arr.length];
        for(int i=0;i<arr.length;i++){
            a[i] = (char) arr[i];
        }
        return a;
    }
    public static void divide(int l,int h,int[] a){
        if(l==h){
            return;
        }
        int m = (l+h)/2;
        divide(l,m,a);//divide Left
        divide(m+1,h,a);//divide right
        merge(l,m,h,a);
    }
    public static void merge(int l,int m,int h,int[] a){
        int left = l;
        int right = m+1;
        int x = 0;
        int[] k = new int[a.length];

        while(left<=m && right<=h){
            if(a[left]>a[right]){
                k[x] = a[right++];
                x++;
            }
            else{
                k[x] = a[left++];
                x++;
            }
        }

        while(left<=m){
            k[x++] = a[left++];
        }
        while(right<=h){
            k[x++] = a[right++];
        }

        x=0;
        for(int i=l;i<=h;i++,x++){
            a[i] = k[x];
        }
    }
}
