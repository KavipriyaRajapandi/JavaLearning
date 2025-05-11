package com.objectorientedprogramming.generics;

import java.util.*;



public class WildCardArrayList<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;

    private int size = 0;




    public WildCardArrayList(){
        data = new Object[DEFAULT_SIZE]; // method to add data in an array
    }

    public static double sum(List<? extends Number> list){

        double sum=0.0;

        for(Number i : list){
            sum += i.doubleValue();
        }
        return sum;



    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length;i++){
            temp[i] = data[i];

        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
         T removed = (T)(data[--size]);
         return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,T value){

        data[index]  = value;



    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args){


        WildCardArrayList<Integer> lst= new WildCardArrayList<>();

            for(int i = 0; i< 15;i++){

                lst.add(2 * i);

            }

        System.out.println(lst);


            List<Integer> lst2 = Arrays.asList(4,2,3,1);

        System.out.println("The sum of int type values are:"+sum(lst2));


        List<Double> lst3 = Arrays.asList(2.32,32.2);

        System.out.println("THe sum of double type values is:"+sum(lst3));











    }

}
