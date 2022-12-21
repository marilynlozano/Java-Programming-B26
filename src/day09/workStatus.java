package day09;

import java.util.Scanner;

public class workStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first name");
        String name = input.next();

        System.out.println("enter last name");
        String lastName = input.next();

        System.out.println("are you employed true/false ");
        Boolean isEmployee = input.nextBoolean();

        System.out.println("are you student true/false");
        boolean isStudent = input.nextBoolean();


    }
}
