package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaPractices {
    public static void main(String[] args) {
        List<String> integes = new ArrayList<String>();
        integes.add("apple");
        integes.add("banana");
        integes.add("orange");
        integes.add("grape");
        integes.add("kiwi");
        integes.add("apricot");

       //streamsAndLambdaToSort(integes);

        streamLambdaToSortString(integes);
    }

    public static void streamsAndLambdaToSort(List<Integer> integers){
        List<Integer> result = integers.stream().map(n -> n * n).filter(n -> n >= 100).
                sorted((a,b)-> b.compareTo(a)).collect(Collectors.toList());
        System.out.println(result);
    }

    public static void streamLambdaToSortString(List<String> strings){
        List<String> sortedStringUpper = strings.stream().filter(n -> n.charAt(0) != 'a').sorted((a,b)-> a.compareTo(b)).
                map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(sortedStringUpper);
    }
}
