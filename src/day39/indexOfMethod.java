package day39;

import java.util.ArrayList;

public class indexOfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        nums.add(100);

        System.out.println(nums);

        System.out.println(nums.indexOf(100));
        System.out.println(nums.indexOf(700));

        System.out.println(nums.lastIndexOf(100));

        nums.set(nums.indexOf(100), 0);

        System.out.println(nums);

        nums.remove(Integer.valueOf(100));
        System.out.println(nums);
    }
}
