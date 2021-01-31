package test.ch13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Student {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("01", "li");
        map.put("02", "wei");
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        Collection<String> coll = map.values();
        Iterator<String> it2 = coll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println(it2.next());
        }
        for (String string : coll) {
            System.out.println(string);
        }
    }
}
