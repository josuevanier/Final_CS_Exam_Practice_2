package org.example;

import java.util.HashSet;
import java.util.PriorityQueue;

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

        HashSet<Integer> integers1 = new HashSet<>();
        PriorityQueue<Integer> integers2 = new PriorityQueue<>();
        for(Integer integer : integers){
            if(!integers1.add(integer)){
                integers2.remove(integer);
            }else {
                integers2.add(integer);
            }
        }

        System.out.println(integers2);
    }
}
