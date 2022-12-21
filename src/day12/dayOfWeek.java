package day12;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the day 1-7");
        int days = input.nextInt();

        if (days == 1) {
            System.out.println("monday");
        } else if (days == 2) {
            System.out.println("tuesday");
        } else if (days == 3) {
            System.out.println("wednesday");
        } else if (days == 4) {
            System.out.println("thursday");
        } else if (days == 5) {
            System.out.println("friday");
        } else if (days == 6) {
            System.out.println("saturday");
        } else if (days == 7) {
            System.out.println("sunday");
        } else {
            System.out.println("wrong number");
        }
    }
}
