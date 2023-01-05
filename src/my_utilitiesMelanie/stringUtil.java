package my_utilitiesMelanie;

public class stringUtil {

    /*
        reverse
        create a method that will accept a String and return the reversed version
     */

    public static String reverse(String word) {
        String reverse ="";
        for (int i = word.length(); i >= 0; i--){
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
}
