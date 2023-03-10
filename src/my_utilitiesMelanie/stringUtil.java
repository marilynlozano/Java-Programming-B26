package my_utilitiesMelanie;

import my_utilities.StringUtil;

public class stringUtil {

    /*
        reverse
        create a method that will accept a String and return the reversed version
     */

    public static String reverse(String word) {
        String reverse ="";
        for (int i = word.length()-1; i >= 0; i--){
            reverse += word.charAt(i);

        }
        return reverse;
    }

    /*
  Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
  Input:
      jamES

  Output:
      James

   */
    public static String fixer(String name){
        String fixer="";
        name = name.toLowerCase().trim();
        fixer= name.toUpperCase().charAt(0) + name.substring(1,name.length());
        return fixer;

    }

    /*
   Frequency of Character

create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word

    */
    public static int frecuency(String word, char letter){
        int counter=0;
        for (int i =0; i<word.length(); i++){
            if (word.charAt(i)==letter){
                counter++;
            }else{
                continue;
            }
        }
        return counter;
    }
    /*
    Unique Characters

create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

Hint: use your frequency method to do some of the work
    */

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


}
