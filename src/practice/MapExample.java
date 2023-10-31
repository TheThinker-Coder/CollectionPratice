package practice;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"jennifer");
        map.put(2,"gal");
        map.put(3,"taylor");
        map.put(4,"kat");
        map.put(5,"bard");
        map.put(6,"she");

       //map.forEach((Key, value )-> System.out.println(Key+" "+value));
        map.forEach((key,value)-> System.out.println(key+" "+ value));

    }
}
