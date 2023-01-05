package day35;

import my_utilities.StringUtil;

public class uniqueCharacters {
    public static String unique(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            int count = StringUtil.frequencyOfCharacter(word, word.charAt(i));

            if (count == 1) {
                result += word.charAt(i);

            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(unique("aaaaabcccdeeff"));
    }
}

