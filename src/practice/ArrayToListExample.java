package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToListExample {
    public static void main(String[] args) {
        String []array = {"demo,demo1,demo2,demo3,demo4,demo5,demo6.demo7"};
        List<String> ls = new ArrayList<>();
        for(String str:array){
            ls.add(str);

        }
        System.out.println(ls);
        List<String> ls2 = Arrays.stream(array[0].split(","))
                .collect(Collectors.toList());

        List<String>ls1 =  Arrays.stream(array[0].split(",")).collect(Collectors.toList());
        System.out.println(ls);
    }


}
