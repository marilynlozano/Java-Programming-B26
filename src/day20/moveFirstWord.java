package day20;

import java.util.Scanner;

public class moveFirstWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a sentence");
        String sentence = input.nextLine(). trim();


        System.out.println((sentence.substring((sentence.indexOf(" ") + 1),sentence.length())) + " "+ (sentence.substring(0,sentence.indexOf(" "))));

    }
}
