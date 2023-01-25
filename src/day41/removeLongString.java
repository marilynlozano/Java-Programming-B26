package day41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeLongString {
     /*
    Remove Long Strings
Create a method that will accept an ArrayList of Strings and an int. Remove any String elements that have less characters than the given number.
Return the modified ArrayList of Strings
@param list - Given ArrayList of Strings @param int - max number of characters @return - ArrayList of Strings
Ex: {“one,”, “two”, “three, “four”, “five”, “six”} Max number: 4
Output: {“three, “four”, “five”
     */

    public static ArrayList<String> removeLongStr(ArrayList<String> list, int maxLenght) {
        ArrayList<String> filtered = new ArrayList<>();
        for (String each : list) {
            if (each.length() >= maxLenght) {
                filtered.add(each);
            }
        }
        return filtered;

    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "two", "three ", "four", "five", "six"));
        System.out.println(removeLongStr(words,4));

    }
}
