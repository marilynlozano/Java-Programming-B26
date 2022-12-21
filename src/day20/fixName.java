package day20;

import java.util.Scanner;

public class fixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your first name");
        String firstName = input.nextLine().toLowerCase().trim();

        System.out.println("enter your last name");
        String lastName = input.nextLine().toLowerCase().trim();

        firstName = (firstName.toUpperCase().charAt(0)) + (firstName.substring(1, firstName.length()));
        lastName = (lastName.toUpperCase().charAt(0)) + (lastName.substring(1, lastName.length()));

        System.out.println(firstName + " " + lastName);
    }
}
