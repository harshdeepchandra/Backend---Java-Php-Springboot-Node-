package queueanddeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Queue
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("Anurag");
        myQueue.add("Sachin");
        myQueue.add("Abhishek");
        myQueue.add("Vikas");
        myQueue.add("Sachin");

        System.out.println(myQueue);

        myQueue.remove();

        System.out.println(myQueue);

        System.out.println("=========================");

        // Deque
        Deque<String> myDeque = new ArrayDeque<>();
        myDeque.add("Anurag");
        myDeque.add("Sachin");
        myDeque.add("Abhishek");
        myDeque.add("Vikas");
        myDeque.add("Sachin");

        System.out.println(myDeque);

        myDeque.addFirst("VIP Nitin");

        System.out.println(myDeque);

        myDeque.addFirst("VVIP Abhishek");

        System.out.println(myDeque);

        myDeque.removeLast();

        System.out.println(myDeque);

    }
}
