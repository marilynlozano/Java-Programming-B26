package day24;

import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your sentence");
        String word = input.next();
        String newWord = "";

        for (int i =0;i< word.length(); i++){
            if (!( newWord.contains("" + word.charAt(i)))){
                newWord+= word.charAt(i);
            }
        }
        System.out.println("newWord = " + newWord);
    }
}
