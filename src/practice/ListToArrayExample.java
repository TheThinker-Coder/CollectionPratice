package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        String[]array = list.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

    }
}
