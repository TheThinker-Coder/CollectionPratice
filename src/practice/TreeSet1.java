package practice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("demo");
        set.add("demo1");
        set.add("demo2");
        set.add("demo3");
        set.add("demo4");
        set.add("demo5");
//        Iterator it = set.iterator();
//        while (it.hasNext()){
//           // System.out.println(it.next());
//        }
        Iterator its = set.descendingIterator();
        while ((its.hasNext())){
            System.out.println(its.next());
        }
    }
}
