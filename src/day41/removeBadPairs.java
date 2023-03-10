package day41;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.Arrays;

public class removeBadPairs {
     /*
    Remove Bad Pairs
Create a method that will accept an Integer ArrayList and check for bad pairs. A pair is an element and the element next to it.
A bad pair is whenever the first number in the pair is bigger then the
second number. Remove any bad pairs for the ArrayList and return the
ArrayList with no bad pairs
Note: The given ArrayList will always be an even number of elements, so each number always has one pair
@param nums - Given ArrayList of numbers @return - ArrayList of numbers
     */


    public static ArrayList<Integer> removeBad(ArrayList<Integer> list){
        ArrayList<Integer> goodPairs = new ArrayList<>();

        for (int i = 0; i < list.size(); i+=2){
            if (list.get(i) < list.get(i+1)){
                goodPairs.add(list.get(i));
                goodPairs.add(list.get(i+1));
            }
        }
        return goodPairs;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,4,6,1,1,10,8,7));
        System.out.println(removeBad(nums));
    }
}
