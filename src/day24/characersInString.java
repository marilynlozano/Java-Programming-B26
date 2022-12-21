package day24;

import java.util.Scanner;

public class characersInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your word");
        String word = input.next();

        for (int i =0; i<word.length();i++){
            System.out.print((int)word.charAt(i) + " ");
        }

    }
}
