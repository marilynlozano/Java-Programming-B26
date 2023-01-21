package day41;

import day29.reverseArray;
import day40_arraylist.ArrayListWithMethods;
import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseAll {

     /*
    Reverse All
Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of
all reversed words
@param words - Given ArrayList of Strings @return - ArrayList of Strings
Ex:
Input: {"ted", "talk", "learn"}
Output: {"det", "klat", "nrael"}
     */


    public static ArrayList<String> reverseArray (ArrayList<String> list){

        ArrayList<String> reverseWords = new ArrayList<>();
        for (String each : list){

            reverseWords.add(StringUtil.reverse(each));
        }
        return reverseWords;


    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ted", "Talk", "Learn"));
        System.out.println(reverseArray(list));

        System.out.println(reverseArray(ArrayListWithMethods.getDaysOfWeek()));
    }
}
