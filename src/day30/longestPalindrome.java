package day30;

import java.util.Arrays;

public class longestPalindrome {
    public static void main(String[] args) {


        String[] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        for (String eachWord : arr) {
            boolean isPalindrome = true;

            for (int i = 0; i < eachWord.length() / 2; i++) {
                if (eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome && eachWord.length() > longestPalindrome.length()) {
                longestPalindrome = eachWord;
            } else {
            }
            if (longestPalindrome.isEmpty()) {
                System.out.println("There is no palindrome");
            } else {
                System.out.println(longestPalindrome);
            }

        }

    }
}

