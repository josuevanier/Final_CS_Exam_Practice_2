package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaPractices {
    public static void main(String[] args) {
        List<Integer> integes = new ArrayList<Integer>();
        integes.add(3);
        integes.add(10);
        integes.add(20);
        integes.add(5);
        integes.add(50);
        integes.add(6);

        streamsAndLambdaToSort(integes);
    }

    public static void streamsAndLambdaToSort(List<Integer> integers){
        List<Integer> result = integers.stream().map(n -> n * n).filter(n -> n >= 100).
                sorted((a,b)-> b.compareTo(a)).collect(Collectors.toList());
        System.out.println(result);
    }
}
