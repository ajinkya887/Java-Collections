package com.learnCollections.Collections;


import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
//        1. ArrayList is a resizable array, part of java.util package.
//        2. It implements the List interface.
//        3. Allows duplicate elements and maintains insertion order.
//        4. Grows dynamically when elements are added beyond its initial capacity.
        ArrayList <String> list = new ArrayList<>();
            list.add("Ajinkya");
            list.add("Sainath");
            list.add("Tejas");
            list.add("Mukesh");
        System.out.println("Using forEach loop");
            for(String name: list){
                System.out.println(name);
            }

        System.out.println("Using forEach with Lambda");
            list.forEach(name -> System.out.println(name));

            ArrayList<String> newList = new ArrayList<>();
            newList.add("Annirudha");
            newList.add("Vishal");

            list.addAll(newList);
        System.out.println(list);

    }
}
