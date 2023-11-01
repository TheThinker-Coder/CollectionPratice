package practice;

import java.util.LinkedList;

public class LinkedListGet {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("demo");
        list.add("demo1");
        list.add("demo2");
        list.forEach(str-> System.out.println(str));
    }
}
