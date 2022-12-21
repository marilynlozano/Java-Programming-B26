package day23;

import java.util.Scanner;

public class countLetter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insert a word");
        String word = input.next();
        char letter = 'a';
        int counter =0;

        for (int i = (word.length()-1); i>0; i--){
            if (letter==word.charAt(i)){
                counter++;

            }
        }
        System.out.println("counter = " + counter);

    }
}
