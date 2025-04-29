package com.learnCollections.Collections;

import java.util.PriorityQueue;

public class LearnPrioprityQueue {
    public static void main(String[] args) {
        //min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(25);
        pq.add(21);
        pq.add(23);
        System.out.println(pq);
        System.out.println("Peek: "+ pq.peek());
        System.out.println("Poll: " + pq.poll());
        System.out.println("After Poll: " + pq);

        //max heap
        PriorityQueue<Integer> maxHeap  = new PriorityQueue<>((a,b) -> b- a);
        maxHeap .add(12);
        maxHeap .add(25);
        maxHeap .add(21);
        maxHeap .add(23);
        System.out.println(maxHeap );
        System.out.println("Peek: "+ maxHeap .peek());
        System.out.println("Poll: " + maxHeap .poll());
        System.out.println("After Poll: " + maxHeap );
    }
}
