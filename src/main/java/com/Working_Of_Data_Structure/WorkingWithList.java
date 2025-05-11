package com.Working_Of_Data_Structure;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    public static void main(String [] args){

        List<String> colorsUnmodifiable = List.of(
                "red",
                "yellow",
                "blue"
        );
        System.out.println(colorsUnmodifiable);

        List<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("yellow");
        colors.add("green");

        System.out.println(colors.size());
        System.out.println(colors.contains("red"));
        System.out.println(colors.contains("yellow"));
        System.out.println(colors);

        //enhanced for loop

        for(String color : colors){
            System.out.println(color);

        }

        //for-each loop(streams)
        colors.forEach(System.out::println);

        //for loop

        for(int i = 0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }


    }

}
