package day24;

import java.util.Scanner;

public class biggestSubstring {
    public static void main(String[] args) {

        String s = "aaabbbb";
        s = s + " ";

        String sub = "";
        String biggest ="";

        for (int i = 0; i < s.length()-1;i++){

            sub += s.charAt(i);

            if (s.charAt(i) != s.charAt(i+1)){

                if (sub.length()>biggest.length()){
                    biggest = sub;
                }
                sub = "";
            }
        }
        System.out.println(biggest);

    }

}

