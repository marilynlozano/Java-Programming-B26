package day33;

public class lastCharacter2D {
    public static void main(String[] args) {

        String [] [] words = {

                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"},

        };

        for (String [] eachArray : words){
            String initials = "";
            for (int i = 0; i< eachArray.length ; i++){
                char [] letters = eachArray[i].toCharArray();
                initials += letters[letters.length-1];

            }System.out.println(initials);
        }
    }
}
