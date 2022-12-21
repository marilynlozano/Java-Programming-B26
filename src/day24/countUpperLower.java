package day24;

import java.util.Scanner;

public class countUpperLower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your word");
        String word = input.next();
        int upperCase = 0;
        int lowerCase = 0;
        int numbers = 0;

        for (int i = 0; i < word.length(); i++) {
            if ((65 <= (int) word.charAt(i)) && ((int) word.charAt(i) <= 90)) {
                upperCase++;
            }
            if ((97 <= (int) word.charAt(i)) && ((int) word.charAt(i) <= 122)) {
                lowerCase++;
            }
            if ((48 <= (int) word.charAt(i)) && ((int) word.charAt(i) <= 57)) {
                numbers++;
            }

        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("numbers = " + numbers);
    }
}

