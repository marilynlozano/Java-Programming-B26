package day23;

import java.util.Scanner;

public class countHi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your sentence");
        String sentence = input.next();

        System.out.println("enter the word ");
        String word = input.next();

        int counter =0;

        for (int i =0; i<sentence.length();i++){
            if ((sentence.charAt(i) == word.charAt(0)) && (sentence.charAt(i+1) == word.charAt(1)) ){
                counter++;
            }
        }
        System.out.println("counter = " + counter);

    }
}
