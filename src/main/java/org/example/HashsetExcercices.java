package org.example;

import java.util.HashSet;

public class HashsetExcercices {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>(5, 0.5f);

        hs.add("one");
        hs.add("two");
        hs.add("three");

        Boolean b = hs.add("one");
        System.out.println(b);
    }
}
