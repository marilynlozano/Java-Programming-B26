package day24;

import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your sentence");
        String sentence = input.nextLine().trim();
        int counter = 0;

        for (int i =0; i<sentence.length();i++){

            if ((sentence.charAt(i)) == ' '){
                    counter++;
                }
            } System.out.println("counter = " + (counter+1));
    }

}
