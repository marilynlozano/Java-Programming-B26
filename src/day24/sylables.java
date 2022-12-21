package day24;

import java.util.Scanner;

public class sylables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your word");
        String word = input.next().trim();
        int counter =0;

        for (int i =0; i<word.length(); i++){
            if (word.charAt(i) == '-'){
                counter++;
            }
        }
        System.out.println("counter = " + (counter + 1));


    }
}
