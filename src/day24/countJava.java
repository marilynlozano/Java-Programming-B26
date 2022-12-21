package day24;

import java.util.Scanner;

public class countJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your sentence");
        String sentence = input.nextLine();
        String word ="java";
        int counter =0;


        for (int i =0;i <sentence.length()-3;i++){
            if (sentence.charAt(i) == 'j'){
                if (sentence.substring(i,(i+4)).equals(word)){
                    counter++;
                }
            }
        }
        System.out.println("counter = " + counter);
    }
}
