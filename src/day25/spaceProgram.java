package day25;

import java.util.Scanner;

public class spaceProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your sentence");
        String sentence = input.nextLine().trim();
        sentence = sentence.replaceAll(" ","-");

        for (int i =0 ; i< sentence.length();i++){

                System.out.print(sentence.charAt(i) + " ");
            }
        }

    }
