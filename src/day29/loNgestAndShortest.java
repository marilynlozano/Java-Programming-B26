package day29;

import day12.biggest;

public class loNgestAndShortest {
    public static void main(String[] args) {

        String [] names = {"Ana", "Paula", "mo", "Melanie"};
        int longest = names[0].length();
        int shortest = names[0].length();
        String longetWord = "";
        String shortestWord = "";

        for (String each : names){
            if (each.length() > longest){
                longest =  each.length();
                longetWord = each;
            }
            if (each.length() < shortest){
                shortest =  each.length();
                shortestWord = each;
            }

        }
        System.out.println(longetWord);
        System.out.println(shortestWord);

    }
}
