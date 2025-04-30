package com.learnCollections.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
//        Hashset
//        1. No duplicates allowed.
//        2. No guaranteed order of elements.
//        3. Backed by a HashMap.
//        4. Allows null (only one).

//        LinkedHashSet
//        1. Maintains insertion order.
//        2. Also backed by a LinkedHashMap.
//        3. Slightly slower than HashSet, but preserves order.
//        4. Still no duplicates allowed.
        Set<Integer> set = new HashSet<>();
         set.add(32);
         set.add(2);
         set.add(54);
         set.add(21);
         set.add(34);
        System.out.println(set);
    }
}
