package day25;

import java.util.Scanner;

public class multiplyEnd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the word");
        String word = input.next();


        System.out.println("enter the number");
        int number = input.nextInt();

        String newWord =word + "";

        for (int i = 0;i<number;i++){
            newWord += word.charAt(word.length()-1);
        }
        System.out.println(newWord);
    }
}
