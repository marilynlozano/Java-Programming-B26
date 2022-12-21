package day19;

import java.util.Locale;
import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your first name");
        String firstName = input.nextLine().toLowerCase().trim();

        System.out.println("enter your last name");
        String lastName = input.nextLine().toLowerCase().trim();

        System.out.println("" + (firstName.toUpperCase().charAt(0)) + (lastName.toUpperCase().charAt(0)));
    }
}
