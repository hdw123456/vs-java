package test.ch13;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UpdateSu implements Comparable<Object> {
    String name;
    long id;

    public UpdateSu(String name, long id) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Object o) {
        UpdateSu upstu = (UpdateSu) o;
        int result = id > upstu.id ? 1 : (id == upstu.id ? 0 : -1);
        return result;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public static void main(String[] args) {
        TreeSet<UpdateSu>tree = new TreeSet<>();
    }
}
