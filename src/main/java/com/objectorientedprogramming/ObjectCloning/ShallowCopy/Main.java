package com.objectorientedprogramming.ObjectCloning.ShallowCopy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{

        Human sibi = new Human(20,"Sibi Varshaan");

        System.out.println(sibi.age);

        Human twin = (Human)sibi.clone();

        System.out.println(twin.age + " "+ twin.name);

        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(sibi.arr));//this is shallow copy when pointing occurs it changes value and DEEPCOPY CREATE NEW OBJECT CREATE AND NOW IT WONT POINT IT WOULD START CREATE NEW ARR VALUES








    }

}
