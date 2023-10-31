package practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("demo");
        hashSet.add("demo1");
        hashSet.add("demo2");
        hashSet.add("demo3");
        hashSet.add("demo4");
        hashSet.add("demo5");
       // System.out.println(hashSet);
//        Iterator itr = hashSet.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//
//        }
        hashSet.forEach(s -> System.out.println(s));
    }
}
