package day25;

import java.util.Scanner;

public class reverseMiddel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = "i love java";
        int firstSpace = sentence.indexOf(" ");
        int secondSpace = sentence.indexOf(" ",firstSpace+1);

        String firstWord = sentence.substring(0,firstSpace);
        String secondWord = sentence.substring(firstSpace+1,secondSpace);
        String thirdWord = sentence.substring(secondSpace+1,sentence.length());
        String reverse = "";

        for (int i = secondWord.length()-1; i>=0;i--){
            reverse+= secondWord.charAt(i);
        }

        System.out.println(firstWord + " " + reverse + " " + thirdWord);
    }
}
