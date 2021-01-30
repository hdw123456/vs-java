package test.ch13;

import java.util.ArrayList;
import java.util.List;

public class Gather {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        int i=(int)(Math.random()*list.size());
        System.out.println(list.get(i));
        list.remove(i);
        for (String x : list) {
            System.out.println(x);
        }
    }
}
