package com.Practice.ArrayTest;

import java.util.*;
public class Part1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        char[] c = {'A','B','C','D'};
        int[] d = {12,23,2,45,63,14,19};
        int[] e = {2,1,0,3,5,4,6,7};
        int[] f = {-1,5,7,8,-6,-2,4,-16};

        //additionOfElements(a);
        //reverseArray(a);
        //maxmin(a);
        //mergeTheArray(a,b);
        /*
        System.out.println("Enter How Many Times need to rotate:");
        int k = sc.nextInt();
        arrayRotation(b,k);
        */
        //mergeAndReverseSecond(a,b);
        //mergeInterChange(a,b);
        //typecastArray(c);
        //addEvenElementsInArray(a);
        /*
        System.out.print("Enter which largest element you want to print:");
        int k = sc.nextInt();
        kthLargestElement(d,k);
        */
        //addPrimeNumbers(e);
        //lesserValueLeftGreaterValueRight(f);


    }
    public static void additionOfElements(int[] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        System.out.print(sum);
    }

    public static void reverseArray(int[] a){
        int left = 0;
        int right = a.length-1;
        while(left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        System.out.print(Arrays.toString(a));
    }

    public static void maxmin(int[] a){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            max = Math.max(a[i],max);
            min = Math.min(a[i],min);
        }
        System.out.println("Maximum:"+max);
        System.out.println("Minimum:"+min);
    }

    public static void mergeTheArray(int[]a,int[]b){
        int[] res = new int[a.length+b.length];
        int x = 0;
        int y = 0;
        for(int i=0;i<res.length;i++){
            if(i<res.length/2){
                res[i] = a[x];
                x++;
            }
            else{
                res[i] = b[y];
                y++;
            }
        }
        System.out.print(Arrays.toString(res));
    }

    public static void arrayRotation(int[]b,int k){
        for(int m=1;m<=k;m++){
            int start = b[0];
            for(int i=1;i<b.length;i++){
                b[i-1] = b[i];
            }
            b[b.length-1] = start;
        }
        System.out.print(Arrays.toString(b));
    }

    public static void mergeAndReverseSecond(int[] a,int[] b){
        int[] res = new int[a.length+b.length];
        int x = 0;
        int y = 0;
        int left = 0;
        int right = b.length-1;//4
        for(int i=0;i<res.length;i++){
            if(i<res.length/2){
                res[i] = a[x];
                x++;
            }
            else{
                while(left<right){//0<4 1<3
                    int temp = b[left];
                    b[left] = b[right];
                    b[right] = temp;
                    left++;
                    right--;
                }
                res[i] = b[y];
                y++;
            }
        }
        System.out.print(Arrays.toString(res));
    }

    public static void mergeInterChange(int[] a,int[] b){
        int[] res = new int[a.length+b.length];
        int x = 0;
        int y = 0;

        for(int i=0;i<res.length;i++){
            if(i%2==0){
                res[i] = a[x];
                x++;
            }
            else{
                res[i] = b[y];
                y++;
            }
        }
        System.out.print(Arrays.toString(res));
    }

    public static void typecastArray(char[] c){
        int[] res = new int[c.length];

        for(int i=0;i<res.length;i++){
            res[i] = c[i];
        }
        System.out.print(Arrays.toString(res));
    }

    public static void addEvenElementsInArray(int[] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                sum += a[i];
            }
        }
        System.out.print("Even Elements Sum:"+sum);
    }

    public static void kthLargestElement(int[] d,int k){
        int max = 0;
        for(int m=1;m<=k;m++){
            max = Integer.MIN_VALUE;
            for(int i=0;i<d.length;i++){
                max = Math.max(max,d[i]);
            }

            for(int i=0;i<d.length;i++){
                if(max==d[i]){
                    d[i] = Integer.MIN_VALUE;
                }
            }
        }
        System.out.print(k+" largest value is "+max);
    }

    public static void addPrimeNumbers(int[] e){
        int sum = 0;
        for(int i=0;i<e.length;i++){
            if(isPrime(e[i])){
                sum += e[i];
            }
        }
        System.out.print("Sum of Prime Numbers "+sum);
    }

    public static boolean isPrime(int num){
        if(num==0||num==1){
            return false;
        }

        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    //Input: [-1,5,7,8,-6,-2,4,-16]
    public static void lesserValueLeftGreaterValueRight(int[] f){
        int left = 0;
        int right = f.length-1;
        while(left<right){
            if(f[left]>0 && f[right]<0){
                int temp = f[left];
                f[left] = f[right];
                f[right] = temp;
                left++;
                right--;
            }
            if(f[left]<0){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.print(Arrays.toString(f));
    }

}
