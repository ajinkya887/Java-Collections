package com.learnCollections.Collections;

import java.util.Map;
import java.util.TreeMap;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);


        numbers.remove("Three");

        if(!numbers.containsKey("Two")) {
            numbers.put("Two", 23);
        }

        for(String key: numbers.keySet()) {
            System.out.println(key);
        }

        for(Integer value: numbers.values()) {
            System.out.println(value);
        }
    }
}
