package day37;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println(numbers);

        numbers.add(100);
        System.out.println(numbers);

        numbers.add(-100);
        System.out.println(numbers);

        numbers.add(50);
        System.out.println(numbers);

        numbers.add(23);
        System.out.println(numbers);

        System.out.println(numbers.get(0));

        System.out.println(numbers.size());
    }
}
