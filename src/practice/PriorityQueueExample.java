package practice;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Jennifer");
        queue.add("kat");
        queue.add("Gal");
        queue.add("taylor");
        queue.add("brad");
        queue.add("pit");
        queue.add("she");
        System.out.println(queue.element());
        System.out.println(queue.peek());
        Iterator it = queue.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
