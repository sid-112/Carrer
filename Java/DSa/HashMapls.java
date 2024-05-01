package com.DSa;
import java.util.*;

public class HashMapls {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);
        table.put(22, "Sid2");
        table.put(23, "Sid3");
        table.put(24, "Sid4");
        table.put(25, "Sid5");

        table.remove(24);

        for (Integer key : table.keySet())
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
    }
}
