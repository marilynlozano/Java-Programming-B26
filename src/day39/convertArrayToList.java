package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class convertArrayToList {
    public static void main(String[] args) {

        Integer [] arr = {1,2,3};

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));

        System.out.println(nums);


        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(4,5,6,7));

        System.out.println(other);

    }
}
