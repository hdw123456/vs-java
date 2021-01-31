package test.ch13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MapText {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Emp su = new Emp("351", "三");
        Emp su2 = new Emp("268", "二");
        Emp su3 = new Emp("134", "一");
        Emp su4 = new Emp("695", "六");
        Emp su5 = new Emp("568", "五");

        map.put(su.getid(), su.getname());
        map.put(su2.getid(), su.getname());
        map.put(su3.getid(), su.getname());
        map.put(su4.getid(), su.getname());
        map.put(su5.getid(), su.getname());

        TreeMap<String, String> treemap = new TreeMap<>();
        treemap.putAll(map);
        Iterator<String>it=treemap.keySet().iterator();
        while (it.hasNext()) {
            String str=(String)it.next();
            String name=(String)treemap.get(str);
            System.out.println(str+" "+name);
        }
    }

}
