package day30;

public class reverseMiddleWord {
    public static void main(String[] args) {

        String sentence = "java always fun";
        String [] words = sentence.split(" ");
        char [] middleWord = words[1].toCharArray();
        String reverse = "";

        for (int i = middleWord.length-1; i>=0; i--){
            reverse += middleWord[i];

        }

        System.out.println(words[0] + " " + reverse + " " + words[2]);
    }
}
