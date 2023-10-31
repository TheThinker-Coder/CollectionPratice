package practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Jennifer");
        deque.add("kat");
        deque.add("Gal");
        deque.add("taylor");
        deque.add("brad");
        deque.add("pit");
        deque.add("she");
        for (String str : deque){
            System.out.println(str);
        }
        deque.forEach(str -> System.out.println(str));
    }
}
