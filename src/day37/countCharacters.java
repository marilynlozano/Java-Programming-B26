package day37;

public class countCharacters {

    public static void main(String[] args) {
        String word = "aP3d572&*jd@jdJU";
        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;

        for (int i = 0; i <word.length(); i++){


            if (Character.isUpperCase(word.charAt(i))){
                upperCase++;
            }

            if (Character.isLowerCase(word.charAt(i))){
                lowerCase++;
            }
            if (Character.isDigit(word.charAt(i))){
                digit++;
            }

        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("digit = " + digit);
    }


}
