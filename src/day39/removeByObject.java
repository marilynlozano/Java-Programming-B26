package day39;

import java.util.ArrayList;

public class removeByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        nums.remove(0);

        System.out.println(nums);

        Integer i = 500;

        nums.remove(i);

        System.out.println(nums);

        nums.remove(Integer.valueOf(200));

        System.out.println(nums);

        nums.remove((Integer)800);

        System.out.println(nums);
    }
}
