package day41;

import java.util.ArrayList;

import static java.util.Arrays.*;

public class removeCountries {

    /*
    Remove Countries
Create a method that will take an ArrayList of countries and returns an ArrayList of countries that have a length of less than 7
@param nums - The given ArrayList of numbers @return - ArrayList of numbers
Ex:
Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
Output: "Japan", "Korea", "Turkey", "Canada"
     */

    public static ArrayList<String> filterCountries(ArrayList<String> manyCountries, int number){

        ArrayList<String> finalCountries = new ArrayList<>();
        for (String each : manyCountries){
            if (each.length() < number)
                finalCountries.add(each);
        }
        return finalCountries;
    }


    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>(asList( "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));
        System.out.println(filterCountries(countries,7));
    }
}
