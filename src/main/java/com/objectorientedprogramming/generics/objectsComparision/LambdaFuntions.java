package com.objectorientedprogramming.generics.objectsComparision;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFuntions {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 5 ; i++){
            arr.add(i+1);
        }
           //i) Single argument and doesnt return uses void

       // Consumer<Integer> fun = (item) -> System.out.println(item * 2);
       // arr.forEach(fun);                     //because consumer use foreach loop to interact with for loop for given array (it gives lambda fn to access the arrayL of for loop)

             //ii) if multiple arguments needed

        Operation sum = (a, b) -> a + b;
        Operation diff = (a, b) -> a - b;
        Operation prod = (a, b) -> a/b;

        LambdaFuntions myCalculator = new LambdaFuntions();

        System.out.println(myCalculator.operate(5,3,sum));
        System.out.println(myCalculator.operate(6,7,diff));


    }

    public int operate(int a,int b,Operation op){

        return op.operation(a,b);



    }





}

interface Operation{
    int operation(int a, int b);      //to use multiple arguments for lambda funtions
}
