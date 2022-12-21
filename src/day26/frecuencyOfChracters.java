package day26;

public class frecuencyOfChracters {
    public static void main(String[] args) {

        String word = "apple";



        for (int j = 0;j<word.length();j++){

            int counting =0;
            for (int i = 0;i< word.length();i++){

                if (word.charAt(j) == word.charAt(i)){
                    counting++;
                }
            } System.out.println( word.charAt(j) +"= " + counting);

        }

    }

}
