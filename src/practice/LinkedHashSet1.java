package practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("demo");
        hashSet.add("demo1");
        hashSet.add("demo2");
        hashSet.add("demo3");
        hashSet.add("demo4");
        hashSet.add("demo5");
        Iterator itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
