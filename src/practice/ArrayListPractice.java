package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("demo");
        list.add("demo1");
        list.add("demo2");
        list.add("demo3");
        System.out.print(list);
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        for (String demo:list){
            System.out.print(demo);
        }
        list.forEach(str -> System.out.println(str));
    }

}
