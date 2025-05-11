package com.Working_Of_Data_Structure;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args){


        String[] colors = new String[5];

        colors[0] = "Purple";
        colors[1] = "Pink";

        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "yellow";

        System.out.println(Arrays.toString(colors));

        //another representation of array

        int[] numbers =  {100,200};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        //for loop

        for(int i = 0;i<colors.length;i++){
            System.out.println(colors[i]);
        }
        for(int i = colors.length - 1 ;i>=0;i--) {
            System.out.println(colors[i]);
        }

        //enhanced for loop

        for(String color : colors){
            System.out.println(color);
        }


    }


}
