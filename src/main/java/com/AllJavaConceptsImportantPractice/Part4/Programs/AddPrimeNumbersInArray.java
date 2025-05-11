package com.AllJavaConceptsImportantPractice.Part4.Programs;

public class AddPrimeNumbersInArray {
    public static void main(String[] args) {
        int [] a = {2,1,0,3,5,4,6,7};

        int sum = solve(a);

        System.out.println("Sum of Prime Numbers in Array is "+sum);
    }

    public static int solve(int[] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            if(isPrime(a[i])){
                sum += a[i];
            }
        }
        return sum;
    }

    public static boolean isPrime(int a){
        if(a==0||a==1){
            return false;
        }
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}

