package com.objectorientedprogramming.collections;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new Vector<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

    }
}
