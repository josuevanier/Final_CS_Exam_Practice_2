package org.example;

import java.util.*;

public class HashsetExcercices {
    public static void main(String[] args) {
        String[] numbers = {
                new String("2"),
                new String("4"),
                new String("5"),
                new String("5"),
                new String("6"),
                new String("6"),
                new String("619"),
        };

        ArrayList<String>  stringo = new ArrayList<>();
        Collections.addAll(stringo, numbers);

        HashSet<String> stringsUnique = new HashSet<>();
        HashSet<String> duplicate = new HashSet<>();

        for(String string : stringo){
            if(stringo.stream().filter(s -> s.equals(string)).count() == 1){
                stringsUnique.add(string);
            }else {
                duplicate.add(string);
            }
        }
        System.out.println(stringsUnique);
    }

    public static void  checkDuplicate(Set s, String[] numbers){
        HashSet<String> integers = new HashSet();

        for(int i = 0; i < numbers.length; i++){
            if(!integers.add(numbers[i])){
                s.remove(numbers[i]);
            }else {
                s.add(numbers[i]);
            }
        }
        System.out.println(s);
    }
}
