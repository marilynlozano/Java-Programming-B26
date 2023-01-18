package day38;

import java.util.Arrays;

public class htmlGenerator {


    public static String htmlGenerator(String str){

        String html = "";
        String [] parts = str.split("\\^");

        int repeat = Integer.parseInt(parts[1]);

        for (int i=0 ; i < repeat; i++){
            html += "<" + parts[0] + "></" + parts[0] + ">";

        }

        return html;
    }

    public static void main(String[] args) {
        System.out.println(htmlGenerator("li^3"));
    }
}
