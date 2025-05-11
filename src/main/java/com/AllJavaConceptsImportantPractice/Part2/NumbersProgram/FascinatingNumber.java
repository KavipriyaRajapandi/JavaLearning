package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

public class FascinatingNumber {
    public static void main(String[] args) {
        int num = 327;
        int multiplyTwo = num*2;
        int multiplyThree = num*3;
        String concOne="";
        String concTwo="";
        String concThree="";
        String stringSum ="";


        while(num>0){
            int last = num%10;
            concOne = last + concOne;
            num/=10;
        }
        if(num==0){
            while(multiplyTwo>0){
                int lastTwo = multiplyTwo%10;
                concTwo = lastTwo + concTwo;
                multiplyTwo/=10;
            }
        }
        if(multiplyTwo==0){
            while(multiplyThree>0){
                int lastThree = multiplyThree%10;
                concThree = lastThree + concThree;
                multiplyThree/=10;
            }
        }

        stringSum = concOne + concTwo + concThree;
        char [] res = stringSum.toCharArray();

        if(res.length==9){
            characterexactlyonceVisited(res);
        }
    }
    public static void characterexactlyonceVisited(char[] arr){
        boolean[] visited = new boolean[10];
        for(int i=0;i<arr.length;i++){
             exactlyonce(arr[i],visited);
        }
        for (int i = 1; i <visited.length; i++) {
            if(visited[i]){

            }
            else{
                return;
            }
        }
        System.out.println("Fascinating Number");

    }
    public static void exactlyonce(char ch,boolean[] visited){
        int index = ch - '0';

        if(visited[index]){
            System.out.println("Not a Fascinating Number");
            return;
        }
        else{
            visited[index] = true;
        }
    }

}
