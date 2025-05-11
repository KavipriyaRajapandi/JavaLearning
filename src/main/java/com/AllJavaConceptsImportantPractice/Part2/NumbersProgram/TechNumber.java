package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long temp = num;
        long count;
        long i;
        String container1 = "";
        String container2 = "";

        for(i=num,count=0;i>0;i/=10,count++){
        }

        long c = count;
        for(int k=1;k<count/2;k++){
            while(num>0){
                if(count>c/2){
                    long last = num%10;
                    container1 = last + container1;
                    num/=10;
                    count--;
                }
                else{
                    long last2 = num%10;
                    container2 = last2 + container2;
                    num/=10;
                    count--;
                }
            }
        }
        int new1 = Integer.parseInt(container1);
        int new2 = Integer.parseInt(container2);

        int add = new1+new2;
        int mul = add*add;
        if(temp==mul){
            System.out.println("Tech Number");
        }
        else{
            System.out.println("Not a Tech Number");
        }




    }
}
