package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPratice {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("demo");
        list.add("demo1");
        list.add("demo2");
        list.add("demo3");
        System.out.print(list);
        Iterator itr =list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }
        for(String str :list){
            System.out.println(str);
        }

    }


}
