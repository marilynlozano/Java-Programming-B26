package day19;

import java.util.Locale;
import java.util.Scanner;

public class tittle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your name include tittle");
        String name = input.nextLine().toLowerCase().trim();

        System.out.println("hello " + (name.toUpperCase(Locale.ROOT).charAt(0)) + name.substring(1,3));


    }
}
