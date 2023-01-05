package day29;

import java.util.Arrays;

public class initials {
    public static void main(String[] args) {

        String [] names = {"James Bond" , "Eve Rell", "Anna Johnson"};


        for (String each :names){
            String initials = "";
            int space = each.indexOf(" ");

            initials = initials + each.charAt(0) + each.charAt(space+1);

            System.out.println(initials);
        }


    }
}
