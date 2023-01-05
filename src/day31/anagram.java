package day31;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {


        String word1 = "listen";
        String word2 = "silent";

        char[] word1letters = word1.toCharArray();
        char[] word2letters = word2.toCharArray();

        Arrays.sort(word1letters);
        Arrays.sort(word2letters);

        System.out.println(Arrays.equals(word1letters,word2letters));
    }
}