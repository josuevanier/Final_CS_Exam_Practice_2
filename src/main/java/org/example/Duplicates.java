package org.example;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>();
        integers.add(1);
        integers.add(2);
        integers.add(7);
        integers.add(78);
        integers.add(78);
        integers.add(78);
        integers.add(8);
        integers.add(8);
        integers.add(88);
        integers.add(-20);

        PriorityQueue<Integer> uniqueIntegers = new PriorityQueue<>(
                integers.stream()
                        .filter(i -> integers.stream().filter(x -> x.equals(i)).count() == 1)
                        .collect(Collectors.toSet())
        );

        System.out.println(uniqueIntegers);
    }
}
