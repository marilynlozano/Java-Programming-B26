package day21;

public class middleChar {
    public static void main(String[] args) {
        String word = "mom";

        String middleChar ="";

       if (word.length() % 2 == 0){
           middleChar = word.substring(((word.length()/2)-1),((word.length()/2)+1));
       } else {
           middleChar = word.substring((word.length())/2,((word.length())/2)+1);
       }
        System.out.println(middleChar);
    }
}
