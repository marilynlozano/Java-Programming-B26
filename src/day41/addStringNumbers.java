package day41;

import java.util.ArrayList;
import java.util.Arrays;

public class addStringNumbers {
    /*
    String numbers to sum
    Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
    Ex:
    Input:
    “123”, “34”, “513” Output:
    [ 6, 7, 9 ]
     */

    public static ArrayList<Integer>  sumFromString (ArrayList<String> list){

        ArrayList<Integer> sums = new ArrayList<>();

        for (String each : list){
            int currentSUm=0;

            for(String eachDigit : each.split("")){

                currentSUm+=Integer.parseInt(eachDigit);

            }

            sums.add(currentSUm);
        }
       return sums;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "34", "513"));
        System.out.println(sumFromString(list));
    }
}
