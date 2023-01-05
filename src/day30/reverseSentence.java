package day30;

import day23_loops.PrintEachChar;

import java.util.Arrays;

public class reverseSentence {
    public static void main(String[] args) {

        String sentence = "today is monday";
        String [] eachWord = sentence.split(" ");
        String reverse = "";

        for (int i = eachWord.length-1; i>=0 ;i--){

           reverse += " " + eachWord[i];

        }
        System.out.println(reverse);

    }
}
