package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class createArrayList {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("hello");
        listOne.add("byr");

        System.out.println(listOne);

        ArrayList<String> listTwo = new ArrayList<>(listOne);

        listTwo.add("hola");

        System.out.println(listOne);
        System.out.println(listTwo);

        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("one", "two", "three"));

        System.out.println(listThree);

    }
}
