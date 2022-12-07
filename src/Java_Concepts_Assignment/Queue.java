package Java_Concepts_Assignment;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.add(10);p.add(30);
        p.add(50);p.add(40);
        System.out.println(p);
        PriorityQueue p1 = new PriorityQueue();
        p1.add(10); p1.add(20);
        p.addAll(p1);
        System.out.println(p);
        p.removeAll(p1);
        System.out.println(p);
        System.out.println(p.size());
        if(p.contains(10)){
            System.out.println("yes");
        }
        PriorityQueue p2 = new PriorityQueue();
        p2.add(30);p2.add(40);
        p.retainAll(p2);
        System.out.println(p);
    }
}
