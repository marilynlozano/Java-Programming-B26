package day10;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a year");
        int year = input.nextInt();

        boolean divisible4 = (year % 4 == 0 || (year %100 ==0 && year % 400 != 0));

        System.out.println("is leap year " + (divisible4 == true));
    }
}
