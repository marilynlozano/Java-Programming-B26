package day39;

import java.util.ArrayList;

public class setMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        System.out.println(nums);

        nums.set(0,-100);
        nums.set(2, 800);

        System.out.println(nums);
    }
}
