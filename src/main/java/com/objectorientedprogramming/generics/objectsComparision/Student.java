package com.objectorientedprogramming.generics.objectsComparision;

import com.objectorientedprogramming.Interfaces.CDPlayer;

import java.util.Arrays;
import java.util.Comparator;

public class Student {

    public static void main(String[] args) {

        ComparisionObjects sibi = new ComparisionObjects(12,89.9f);
        ComparisionObjects sibi2 = new ComparisionObjects(13,95.2f);
        ComparisionObjects sibi3 = new ComparisionObjects(14,77.3f);
        ComparisionObjects sibi4 = new ComparisionObjects(15,23.2f);
        ComparisionObjects sibi5 = new ComparisionObjects(18,79.2f);

        ComparisionObjects[] lst = {sibi , sibi2 , sibi3, sibi4, sibi5};

        System.out.println(Arrays.toString(lst));

        Arrays.sort(lst, new Comparator<ComparisionObjects>() {
            @Override
            public int compare(ComparisionObjects o1, ComparisionObjects o2) {
                return (int)(o1.marks - o2.marks);
            }
        });

        Arrays.sort(lst, (o1, o2) -> (int)(o1.marks - o2.marks));   //LAMBDA FUNCTION

        System.out.println(Arrays.toString(lst));

        if(sibi.compareTo(sibi2) < 0){
            System.out.println(sibi.compareTo(sibi2));
            System.out.println("sibi2 has got more marks");

        }

    }
}
