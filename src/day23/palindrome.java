package day23;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the word");
        String word = input.next();
        String reverse="";

        for (int i = (word.length()-1); i >=0; i--){
            reverse += word.charAt(i);

        }

        if (word.equals(reverse)){
            System.out.println("it is polindrome");
        }else{
            System.out.println("is not polindrome");
        }
    }
}
