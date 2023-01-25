package day42;

import java.util.Scanner;

public class usingApp {
    public static void main(String[] args) {

        app cydeo = new app();

        cydeo.name = "cydeo";
        cydeo.version = 505;
        cydeo.isFree = true;

        cydeo.run();
        cydeo.update();

        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);
        System.out.println(cydeo);

        new app().run();

        new Scanner(System.in).nextLine();




    }
}
