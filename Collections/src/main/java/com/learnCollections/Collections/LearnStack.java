package com.learnCollections.Collections;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        //    1. Stack is a Last-In, First-Out (LIFO) data structure.
        //    2. It is a subclass of Vector, part of java.util package.
        //    3. It allows you to push, pop, peek, and check if it's empty.

        Stack<String> stk = new Stack<>();
        stk.push("Elephant");
        stk.push("lion");
        stk.push("dog");
        stk.push("cat");
        System.out.println(stk);
        System.out.println("Top Element: "+ stk.peek());
        System.out.println("Popped: "+ stk.pop());
        System.out.println(stk);
        System.out.println("Stack is Empty: "+ stk.isEmpty());
        System.out.println("Position of lion: "+ stk.search("lion"));
        System.out.println("Using Enhanced For Loop (bottom to top)");
        for (String item : stk) {
            System.out.println(item);
        }
    }
}
