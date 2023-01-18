package day39;

import java.util.ArrayList;

public class clearMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        System.out.println(nums);

        nums.clear();

        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
    }
}
