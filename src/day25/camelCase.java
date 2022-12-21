package day25;

import java.util.Scanner;

public class camelCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your sentence");

        String sentence = input.nextLine().toLowerCase().trim();

        String newSentence = sentence.substring(0,1);

        for (int i = 1; i < sentence.length(); i++) {


            if (sentence.charAt(i-1) != ' '){
                newSentence += sentence.charAt(i);
            }
            if (sentence.charAt(i-1) == ' '){
                newSentence += sentence.toUpperCase().charAt(i);
            }

        }
        System.out.println(newSentence.replaceAll(" ",""));


    }

}
