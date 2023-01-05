package day35;

public class frecuencyOfCharacters {

    /*
   Frequency of Character

create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word

Ex:
   Input:
       apple, p

   Output:
       2

Ex:
   Input:
       apple, z

   Output:
       0

Ex:
   Input:
       aabbaacca, a

   Output:
       5
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

    public static void main(String[] args) {
        System.out.println(frecuency("aabbaacca",'a'));
    }
}
