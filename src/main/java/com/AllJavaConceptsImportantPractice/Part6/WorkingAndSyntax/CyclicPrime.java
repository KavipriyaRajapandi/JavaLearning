package com.AllJavaConceptsImportantPractice.Part6.WorkingAndSyntax;

public class CyclicPrime {
    public static void main(String[] args) {
        String s = "1193";
        int length = s.length();

        if(isCyclicPrime(s,length)){
            System.out.println("Cyclic Prime");
        }
        else{
            System.out.println("Not a Cyclic Prime");
        }
    }
    public static boolean isCyclicPrime(String s,int len){
        char[] ch = s.toCharArray();
        boolean[] prime = new boolean[len];
        String check = "";

        for(int m=0;m<len;m++){
            check = new String(ch);
            int num = Integer.parseInt(check);
            if(isPrime(num)){
                prime[m] = true;
            }
            char start = ch[0];
            for(int i=1;i<ch.length;i++){
                ch[i-1] = ch[i];
            }
            ch[ch.length-1] = start;
        }

        for(int i=0;i<prime.length;i++){
            if(!prime[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int num){
        if(num==0 || num==1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
