package day27;

public class uniqueCharacters {
    public static void main(String[] args) {

        String word = "AAABCCDEEF";

        for (int j = 0;j<word.length();j++){

            int count =0;
            for (int i = 0; i<word.length();i++){
                if (word.charAt(i) == word.charAt(j)){
                    count ++;
                }
            }
            if (count == 1){
                System.out.print(word.charAt(j));
            }
        }

    }
}
