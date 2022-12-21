package day27;

public class duplicateCharacters {
    public static void main(String[] args) {

        String word = "AAABCCDEEF";
        String checked = "";

        for (int j = 0; j < word.length(); j++) {

            if (!(checked.contains("" + word.charAt(j)))) {
                checked += word.charAt(j);


                int counter = 0;

                for (int i = 0; i < word.length(); i++) {

                    if (word.charAt(j) == word.charAt(i)) {
                        counter++;
                    }
                }
                if (counter != 1)
                    System.out.print(word.charAt(j));
            }
        }
    }
}
