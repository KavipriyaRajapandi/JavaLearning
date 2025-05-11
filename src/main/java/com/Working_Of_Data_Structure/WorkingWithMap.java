package com.Working_Of_Data_Structure;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMap {

    public static void main(String[] args){

        Map<Integer, Person> map = new HashMap<>();

        map.put(1,new Person("Ali"));
        map.put(2,new Person("Ben"));
        map.put(3,new Person("Tenz"));

        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.get(1));

        System.out.println(map.containsKey(4));

        System.out.println(map.entrySet());

        System.out.println(map.keySet());

        map.remove(3);

        map.entrySet().forEach(x -> System.out.println(x.getKey()+ "" + x.getValue()));

        map.forEach((Key, Person) -> {
            System.out.println(Key + "-" + Person);

        });

        System.out.println(map.getOrDefault(3,new Person("Default")));

        System.out.println(map.values());


        }
    record Person(String name){}
    }


