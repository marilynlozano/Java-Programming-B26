package day40;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class usingColectionClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,6,2,67,22,230,12));

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
        System.out.println(letters);
        Collections.reverse(letters);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Collections.swap(letters,0,3);
        System.out.println(letters);

        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(11,11,20,11,20,30));
        System.out.println(Collections.frequency(number,11));

        ArrayList<String> word = new ArrayList<>(Arrays.asList("one", "two", "one", "one", "one", "three"));
        System.out.println(Collections.frequency(word,"one"));



    }
        }
