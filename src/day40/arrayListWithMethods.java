package day40;

import day02_04_11_2022.ArrayVsArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListWithMethods {

    public static void main(String[] args) {
        System.out.println(getDaysOfWeek());
        ArrayList<String> days = getDaysOfWeek();
        System.out.println(days.get(0));
        System.out.println(getDaysOfWeek().get(0));


        System.out.println( printList(getDaysOfWeek()));

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(printList(list));
    }

    public static String printList(ArrayList<String> list){
        String str = "List: ";
        for (String each:list){
            str += "\n~\t" + each;
        }
        return  str;

    }

    public static ArrayList<String> getDaysOfWeek(){

        ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday","Thursday","Friday", "Saturday", "Sunday"));

        return days;

    }

}
